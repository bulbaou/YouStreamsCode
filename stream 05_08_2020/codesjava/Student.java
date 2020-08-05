package codesjava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс {@code Student} описывает студента с именем и списком целочисленных оценок.
 * ограничений на значения, в данном случае, не наложено, однако имя 
 * неизменяемо. Студент может быть сравнен с другим студентом по 
 * принципу "у кого сумма баллов больше тот и лучше" и склонирован
 * с получением глубокой копии. Поля отмечены как финальные, так
 * как их изменение не предполагается. Создание возможно через указание
 * имени или через копирующий конструктор. Два студента равны если список их 
 * оценок одинаков и у них одинаковые имена.
 * 
 * @author  Ermakov Alexander
 */
public class Student implements Comparable<Student>, Cloneable{
    private final String name;
    private final List<Integer> marks=new ArrayList<>();    
    
    public Student(String name) {
        this.name = name;
    }
    
    public Student(Student st) {
        this.name = st.name;
        this.marks.addAll(st.marks);
    }
    
    public void addGrade(int ... x){
        for(int i:x) marks.add(i);
    }
    
    public List<Integer> getGrades(){
        return marks;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Student o) {
        int sum1=this.marks.stream().mapToInt(x->x).sum();
        int sum2=o.marks.stream().mapToInt(x->x).sum();
        return sum1-sum2;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", marks=" + marks + '}';
    }
    
    @Override
    public Student clone() throws CloneNotSupportedException{
        Student st= (Student)super.clone();
        st.marks.addAll(this.marks);
        return st;
    }   
    /*
        A==A true рефлексивность
        A==B то B==A симметричность
        A==B==C A==C транзитивность
    */
    @Override
    public boolean equals(Object obj) {
        if(this==obj) return true;
        if(obj==null) return false;
        if(obj.getClass()!=this.getClass()) return false;
        Student st=(Student)obj;     
        if(!(this.name==st.name||st.name!=null&&st.name.equals(this.name))) return false;        
        return this.marks.equals(st.marks);
    }
    //если два объекта по equals одинаковы значит hash code одинаковый
    //если два объекта по equals разные то это ничего не значит
    //если два объекта по equals разные и хэш кода одинаковы это коллизия
    @Override
    public int hashCode() {
        return this.name.hashCode()+this.marks.hashCode();
    }
    
}
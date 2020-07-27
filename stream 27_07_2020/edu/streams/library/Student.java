package edu.streams.library;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Класс {@code Student} описывает студента. Студент представляет собой
 * комбинацию имени и списка оценок, причем имя это непустая строка,
 * а оценки это строко-числовая комбинация хранящаяся в виде объектов
 * класса {@link edu.streams.library.Grade}. Имя задается конструктором 
 * и не может быть изменено, но можно его узнать. Оценки добавляются в 
 * виде чисел от 2 до 5 и все они могут быть просмотрены в любой
 * момент времени
 * 
 * @author  Ermakov Alexander
 */
public class Student {
    private final String name;
    private final List<Grade> marks=new ArrayList<>();
    
    /**
     * Создание нового {@code Student} возможно только с указанием имени.
     *
     * @param  name
     *         имя студента, не null и не пустая строка, иначе {@code IllegalArgumentException}
     */
    public Student(String name) {
        if(name==null||name.trim().isEmpty())
            throw new IllegalArgumentException("name of student cant be empty");
        this.name = name;        
    }
    /**
     * Добавление оценок.
     *
     * @param  marks
     *         оценки в виде чисел от 2 до 5, иначе {@code IllegalArgumentException}
     */
    public void addMarks(int... marks) {
        for(int x:marks){
            if(x<2||x>5) throw new IllegalArgumentException("students grade must be between 2 and 5");
            if(x==2) this.marks.add(new Grade(2,"неуд"));
            if(x==3) this.marks.add(new Grade(3,"удов"));
            if(x==4) this.marks.add(new Grade(4,"хор"));
            if(x==5) this.marks.add(new Grade(5,"отл"));
        }
    }
    
    public String getName() {
        return name;
    }
    
    public Grade[] getMarks(){
        return marks.toArray(x->new Grade[x]);
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", marks=" + marks + '}';
    }
    
}

package codesjava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Александр
 */
public class CodesJava {

    public static void main(String[] args) throws CloneNotSupportedException {
        Map<Student, String> map= new HashMap<>();        
        Student st= new Student("pete");
        map.put(st,"YES!");
        st.addGrade(4,5);
        System.out.println(map.get(st));
    }
}
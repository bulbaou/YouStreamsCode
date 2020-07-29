package codesjava;

import java.util.Scanner;

/**
 * @author Александр
 */
public class CodesJava {

    public static void main(String[] args) throws Exception{
        met();
    }
    public static void met()throws Exception{
        Scanner sc = new Scanner(System.in);
        String name=sc.nextLine();
        Testable a = (Testable)Class.forName(name).newInstance();
        a.test();
    }
}
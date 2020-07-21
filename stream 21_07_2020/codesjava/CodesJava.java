package codesjava;

public class CodesJava {
    
    public static void main(String[] арг) {
        Human h= new Human("pete");
        Human h2= new Human("tom");
        h.parent=h2;
        System.out.println(h);
    }
}
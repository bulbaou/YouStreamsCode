package codesjava;

import java.util.ArrayList;

/**
 * @author Александр
 */
public class CodesJava {

    public static void main(String[] args) {
        B b = new B("QQ");   
        b.test();        
    }
}

abstract class A extends Object{
    String txt;
    public A(String txt) {
        this.txt = txt;
    }
    public abstract void test();
    public final void test(String s){
        System.out.println(txt+s);
    }    
}

class B extends A {
    public B(String txt) {    
        super(txt);     
    }
    @Override
    public void test(){
        System.out.println("B:"+txt);
    }
    @Override
    public String toString() {
        return "B{" +txt+ '}';
    }
    
}

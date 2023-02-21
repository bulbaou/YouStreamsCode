package ru;

import java.lang.reflect.Proxy;

public class MyProg {

    public static void main(String[] args) { 
        A a= new A(2);
        CacheHandler h=new CacheHandler(a);
        Powerable pable=(Powerable)Proxy.newProxyInstance(
                a.getClass().getClassLoader(),
                new Class[]{Powerable.class},h);
        ohmy(pable);
        ohmy(pable);
        ohmy(pable);
    }
    public static void ohmy(Powerable p){
        System.out.println(p.pow());             
    }
}

class A implements Powerable{
    int x;

    public A(int x) {
        this.x = x;
    }

    @Override
    @Cache
    public double pow() {
        System.out.println("A");
        return x*x;
    }
    
}

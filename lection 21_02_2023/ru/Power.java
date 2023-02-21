package ru;

public class Power implements Powerable{
    double num;
    double step;

    public Power(double num, double step) {
        this.num = num;
        this.step = step;
    }

    public double pow(){
        System.out.println("try to pow");
        return Math.pow(num, step);
    }
}

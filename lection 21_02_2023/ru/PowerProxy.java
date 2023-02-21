package ru;

public class PowerProxy implements Powerable {

    Power obj;
    double cache;
    double num;
    double step;

    public PowerProxy(Power obj) {
        this.obj = obj;
        num = obj.num;
        step = obj.step;
        cache = obj.pow();
    }

    @Override
    public double pow() {
        if (num != obj.num || step != obj.step) {
            num = obj.num;
            step = obj.step;
            cache = obj.pow();
        }
        return cache;
    }
}

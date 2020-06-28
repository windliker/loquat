package com.windlike.loquat.designpattern.factorymethod;

public abstract class Operation {

    private double value1 = 0.0;
    private double value2 = 0.0;

    public abstract double getResult();

    public double getValue1() {
        return value1;
    }

    public void setValue1(double value1) {
        this.value1 = value1;
    }

    public double getValue2() {
        return value2;
    }

    public void setValue2(double value2) {
        this.value2 = value2;
    }

}

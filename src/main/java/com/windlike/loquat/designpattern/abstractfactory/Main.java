package com.windlike.loquat.designpattern.abstractfactory;

public class Main {
    public static void main(String[] args) {
        CarFactory factory = new SportCarFactory();
        TeslaCar teslaCar = factory.getTeslaCar();
        teslaCar.charge();
    }
}

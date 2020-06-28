package com.windlike.loquat.designpattern.abstractfactory;

public class TeslaBusinessCar implements TeslaCar {
    @Override
    public void charge() {
        System.out.println("特斯拉商务车充电");
    }
}

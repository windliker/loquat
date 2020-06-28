package com.windlike.loquat.designpattern.abstractfactory;

public class TeslaSportCar implements TeslaCar {
    @Override
    public void charge() {
        System.out.println("特斯拉跑车充电");
    }
}

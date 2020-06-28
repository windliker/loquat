package com.windlike.loquat.designpattern.abstractfactory;

public class BenzSportCar implements BenzCar {
    @Override
    public void gasUp() {
        System.out.println("奔驰跑车加汽油");
    }
}

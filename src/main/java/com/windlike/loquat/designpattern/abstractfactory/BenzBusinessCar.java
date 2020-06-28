package com.windlike.loquat.designpattern.abstractfactory;

public class BenzBusinessCar implements BenzCar {

    @Override
    public void gasUp() {
        System.out.println("奔驰商务车加汽油");
    }
}

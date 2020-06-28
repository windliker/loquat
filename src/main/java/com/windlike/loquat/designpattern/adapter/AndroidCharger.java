package com.windlike.loquat.designpattern.adapter;

public class AndroidCharger implements MicroUsbInterface {
    @Override
    public void chargeWithMicroUsb() {
        System.out.println("使用microUsb接口的安卓电源适配器充电...");
    }
}

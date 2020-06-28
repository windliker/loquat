package com.windlike.loquat.designpattern.adapter;

public class GalaxyS7 {
    private MicroUsbInterface microUsbInterface;

    public GalaxyS7() {}

    public GalaxyS7(MicroUsbInterface microUsbInterface) {
        this.microUsbInterface = microUsbInterface;
    }

    public void charge() {
        System.out.println("正在给GalaxyS7手机充电...");
        microUsbInterface.chargeWithMicroUsb();
    }

    public MicroUsbInterface getMicroUsbInterface() {
        return microUsbInterface;
    }

    public void setMicroUsbInterface(MicroUsbInterface microUsbInterface) {
        this.microUsbInterface = microUsbInterface;
    }
}

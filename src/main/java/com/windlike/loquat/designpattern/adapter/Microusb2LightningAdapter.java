package com.windlike.loquat.designpattern.adapter;

// 适配器，将microusb接口转为lightning接口
// microsub接口
// +micro2lightning适配器(具备给苹果手机充电的功能)
// 实现为苹果手机充电
public class Microusb2LightningAdapter implements LightningInterface {

    private MicroUsbInterface microUsbInterface;

    public Microusb2LightningAdapter() {}

    public Microusb2LightningAdapter(MicroUsbInterface microUsbInterface) {
        this.microUsbInterface = microUsbInterface;
    }

    @Override
    public void chargeWithLightning() {
        microUsbInterface.chargeWithMicroUsb();
    }

    public MicroUsbInterface getMicroUsbInterface() {
        return microUsbInterface;
    }

    public void setMicroUsbInterface(MicroUsbInterface microUsbInterface) {
        this.microUsbInterface = microUsbInterface;
    }
}

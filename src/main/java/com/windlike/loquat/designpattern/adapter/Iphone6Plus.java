package com.windlike.loquat.designpattern.adapter;

public class Iphone6Plus {

    private LightningInterface lightningInterface;

    public Iphone6Plus() {}

    public Iphone6Plus(LightningInterface lightningInterface) {
        this.lightningInterface = lightningInterface;
    }

    public void charge() {
        System.out.println("正在给Iphone6Plus手机充电...");
        lightningInterface.chargeWithLightning();
    }

    public LightningInterface getLightningInterface() {
        return lightningInterface;
    }

    public void setLightningInterface(LightningInterface lightningInterface) {
        this.lightningInterface = lightningInterface;
    }
}

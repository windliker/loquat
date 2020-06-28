package com.windlike.loquat.designpattern.adapter;

public class AppleCharger implements LightningInterface {
    @Override
    public void chargeWithLightning() {
        System.out.println("使用lightning接口的苹果电源适配器充电...");
    }
}

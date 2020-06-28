package com.windlike.loquat.designpattern.adapter;

public class Main {
    public static void main(String[] args) {
        Iphone6Plus iphone6Plus = new Iphone6Plus(new AppleCharger());
        iphone6Plus.charge();
        System.out.println("========================");

        GalaxyS7 galaxyS7 = new GalaxyS7(new AndroidCharger());
        galaxyS7.charge();
        System.out.println("========================");

        Microusb2LightningAdapter adapter = new Microusb2LightningAdapter(new AndroidCharger());
        iphone6Plus.setLightningInterface(adapter);
        iphone6Plus.charge();
    }
}

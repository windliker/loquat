package com.windlike.loquat.designpattern.factorymethod;

public class Main {
    public static void main(String[] args) {
        IFactory factory = new AddFactory();
        Operation operation = factory.CreationOption();
        operation.setValue1(1);
        operation.setValue2(10);
        System.out.println(operation.getResult());
    }
}

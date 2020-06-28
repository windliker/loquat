package com.windlike.loquat.designpattern.factorymethod;

public class OperationMul extends Operation {
    @Override
    public double getResult() {
        return getValue1() * getValue2();
    }
}

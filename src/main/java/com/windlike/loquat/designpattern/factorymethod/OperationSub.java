package com.windlike.loquat.designpattern.factorymethod;

public class OperationSub extends Operation {
    @Override
    public double getResult() {
        return getValue1() - getValue2();
    }
}

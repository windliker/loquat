package com.windlike.loquat.designpattern.factorymethod;

public class OperationDiv extends Operation{
    @Override
    public double getResult() {
        if (getValue2() != 0) {
            return getValue1() / getValue2();
        }
        throw new IllegalArgumentException("除数不能为0");
    }
}

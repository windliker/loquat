package com.windlike.loquat.designpattern.factorymethod;

public class MulFactory implements IFactory {
    @Override
    public Operation CreationOption() {
        return new OperationMul();
    }
}

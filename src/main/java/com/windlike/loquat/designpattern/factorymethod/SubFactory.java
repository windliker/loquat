package com.windlike.loquat.designpattern.factorymethod;

public class SubFactory implements IFactory {
    @Override
    public Operation CreationOption() {
        return new OperationSub();
    }
}

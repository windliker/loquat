package com.windlike.loquat.designpattern.factorymethod;

public class DivFactory implements IFactory {
    @Override
    public Operation CreationOption() {
        return new OperationDiv();
    }
}

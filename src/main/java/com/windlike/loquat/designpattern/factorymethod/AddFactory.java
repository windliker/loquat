package com.windlike.loquat.designpattern.factorymethod;

public class AddFactory implements IFactory{


    @Override
    public Operation CreationOption() {
        return new OperationAdd();
    }
}

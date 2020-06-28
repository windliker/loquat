package com.windlike.loquat.designpattern.builder;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        Builder builder = new NormalRoleBuilder();

        director.construct(builder);
        Role role = builder.getResult();
        System.out.println(role);
    }
}

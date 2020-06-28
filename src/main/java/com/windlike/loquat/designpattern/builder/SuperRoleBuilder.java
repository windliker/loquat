package com.windlike.loquat.designpattern.builder;

public class SuperRoleBuilder extends Builder {

    private Role role = new Role();

    @Override
    public void buildHead() {
        role.setHead("super head");
    }

    @Override
    public void buildFace() {
        role.setFace("super face");
    }

    @Override
    public void buildBody() {
        role.setBody("super body");
    }

    @Override
    public void buildHp() {
        role.setHp(120.0);
    }

    @Override
    public void buildSp() {
        role.setSp(120.0);
    }

    @Override
    public void buildMp() {
        role.setMp(120.0);
    }

    @Override
    public Role getResult() {
        return  role;
    }
}

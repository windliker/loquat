package com.windlike.loquat.designpattern.builder;

public class NormalRoleBuilder extends Builder {

    private Role role = new Role();

    @Override
    public void buildHead() {
        role.setHead("normal head");
    }

    @Override
    public void buildFace() {
        role.setFace("normal face");
    }

    @Override
    public void buildBody() {
        role.setBody("normal body");
    }

    @Override
    public void buildHp() {
        role.setHp(100.0);
    }

    @Override
    public void buildSp() {
        role.setSp(100.0);
    }

    @Override
    public void buildMp() {
        role.setMp(100.0);
    }

    @Override
    public Role getResult() {
        return role;
    }
}

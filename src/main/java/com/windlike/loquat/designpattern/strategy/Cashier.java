package com.windlike.loquat.designpattern.strategy;

import java.math.BigDecimal;

public class Cashier {
    private Member member;

    public Cashier() {}

    public Cashier(Member member) {
        this.member = member;
    }

    public BigDecimal quote(BigDecimal bookPrice) {
        return this.member.calPrice(bookPrice);
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }
}

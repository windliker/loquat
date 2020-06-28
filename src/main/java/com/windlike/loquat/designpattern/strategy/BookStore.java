package com.windlike.loquat.designpattern.strategy;

import java.math.BigDecimal;

public class BookStore {
    public static void main(String[] args) {
        Cashier cashier = new Cashier(new AdvancedMember());
        System.out.println(cashier.quote(new BigDecimal("300")));

        cashier.setMember(new IntermediateMember());
        System.out.println(cashier.quote(new BigDecimal("300")));

        cashier.setMember(new PrimaryMember());
        System.out.println(cashier.quote(new BigDecimal("300")));
    }
}

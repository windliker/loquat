package com.windlike.loquat.designpattern.strategy;

import java.math.BigDecimal;

public class IntermediateMember implements Member {
    @Override
    public BigDecimal calPrice(BigDecimal bookPrice) {
        System.out.println("中级会员打9折");
        return bookPrice.multiply(new BigDecimal("0.9"));
    }
}

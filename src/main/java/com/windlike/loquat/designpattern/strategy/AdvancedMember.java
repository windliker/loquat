package com.windlike.loquat.designpattern.strategy;

import java.math.BigDecimal;

public class AdvancedMember implements Member{
    @Override
    public BigDecimal calPrice(BigDecimal bookPrice) {
        System.out.println("高级会员打8折");
        return bookPrice.multiply(new BigDecimal("0.8"));
    }
}

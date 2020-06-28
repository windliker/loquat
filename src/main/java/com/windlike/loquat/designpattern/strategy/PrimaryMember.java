package com.windlike.loquat.designpattern.strategy;

import java.math.BigDecimal;

public class PrimaryMember implements Member{
    @Override
    public BigDecimal calPrice(BigDecimal bookPrice) {
        System.out.println("初级会员没有折扣");
        return bookPrice;
    }
}

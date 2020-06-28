package com.windlike.loquat.designpattern.strategy;

import java.math.BigDecimal;

public interface Member {

    BigDecimal calPrice(BigDecimal bookPrice);
}

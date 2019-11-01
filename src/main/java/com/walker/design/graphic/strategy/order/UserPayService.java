package com.walker.design.graphic.strategy.order;

import java.math.BigDecimal;

/**
 * @author walker
 * @date 2019/11/1
 */
public interface UserPayService {

    /**
     * 计算应付价格
     *
     * @param price
     * @return
     */
    BigDecimal quote(BigDecimal price);
}

package com.walker.design.graphic.strategy.order;

import java.math.BigDecimal;

/**
 * @author walker
 * @date 2019/11/1
 */
public class ParticularVipPayServiceImpl implements UserPayService, InitializingBean {
    @Override
    public BigDecimal quote(BigDecimal price) {
        return null;
    }

    @Override
    public void afterPropertiesSet() {
        UserPayServiceStrategyFactory.register("particular", this);
    }
}

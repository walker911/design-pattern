package com.walker.design.zen.state;

import java.math.BigDecimal;

/**
 * @author walker
 * @date 2019/8/29
 */
public class Order {
    private OrderStateMachine stateMachine = OrderStateMachine.DISPATCHING;

    private String name;

    private BigDecimal amount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Order nextState() {
        this.stateMachine = stateMachine.nextState();
        return this;
    }

    public void log() {
        System.out.println(this.stateMachine.prevState() + "---->" + this.stateMachine.name());
    }

    public static void main(String[] args) {
        Order order = new Order();
        order.setAmount(BigDecimal.TEN);
        order.setName("test");

        order.nextState();
        order.log();
        order.nextState();
        order.log();
    }
}

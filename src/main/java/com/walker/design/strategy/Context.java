package com.walker.design.strategy;

/**
 * @author walker
 * @date 2019/3/27
 */
public class Context {

    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void operate() {
        this.strategy.operate();
    }
}

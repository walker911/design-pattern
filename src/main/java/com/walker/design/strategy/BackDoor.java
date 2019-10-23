package com.walker.design.strategy;

/**
 * @author walker
 * @date 2019/3/27
 */
public class BackDoor implements IStrategy {
    @Override
    public void operate() {
        System.out.println("back door");
    }
}

package com.walker.design.zen.abstractfactory;

/**
 * @author walker
 * @date 2019/3/26
 */
public abstract class AbstractWhiteHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("white color");
    }

    @Override
    public void talk() {
        System.out.println("white talk");
    }
}

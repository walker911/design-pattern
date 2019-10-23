package com.walker.design.zen.factory;

/**
 * @author walker
 * @date 2019/3/25
 */
public class WhiteHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("white color");
    }

    @Override
    public void talk() {
        System.out.println("white talk");
    }
}

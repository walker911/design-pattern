package com.walker.design.zen.factory;

/**
 * @author walker
 * @date 2019/3/25
 */
public class BlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("black color");
    }

    @Override
    public void talk() {
        System.out.println("black talk");
    }
}

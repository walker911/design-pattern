package com.walker.design.zen.factory;

/**
 * @author walker
 * @date 2019/3/25
 */
public class YellowHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("yellow color");
    }

    @Override
    public void talk() {
        System.out.println("yellow talk");
    }
}

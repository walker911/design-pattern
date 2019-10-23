package com.walker.design.abstractfactory;

/**
 * @author walker
 * @date 2019/3/26
 */
public class FemaleWhiteHuman extends AbstractWhiteHuman {
    @Override
    public void getSex() {
        System.out.println("white female");
    }
}

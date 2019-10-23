package com.walker.design.abstractfactory;

/**
 * @author walker
 * @date 2019/3/26
 */
public class MaleYellowHuman extends AbstractYellowHuman {
    @Override
    public void getSex() {
        System.out.println("yellow male");
    }
}

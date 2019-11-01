package com.walker.design.graphic.decorator;

/**
 * @author walker
 * @date 2019/11/1
 */
public abstract class Border extends Display {
    protected Display display;

    public Border(Display display) {
        this.display = display;
    }
}

package com.walker.design.graphic.abstraction.factory;

/**
 * 抽象的零件
 *
 * @author walker
 * @date 2019/10/30
 */
public abstract class Item {
    protected String caption;

    public Item(String caption) {
        this.caption = caption;
    }

    public abstract String makeHTML();
}

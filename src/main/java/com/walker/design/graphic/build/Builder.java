package com.walker.design.graphic.build;

/**
 * @author walker
 * @date 2019/10/29
 */
public abstract class Builder {
    public abstract void makeTitle(String title);
    public abstract void makeString(String str);
    public abstract void makeItems(String[] items);
    public abstract void close();
}

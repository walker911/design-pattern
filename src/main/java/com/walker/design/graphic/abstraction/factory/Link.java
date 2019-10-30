package com.walker.design.graphic.abstraction.factory;

/**
 * @author walker
 * @date 2019/10/30
 */
public abstract class Link extends Item {
    protected String url;

    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}

package com.walker.design.graphic.visitor;

/**
 * @author walker
 * @date 2019/11/4
 */
public interface Element {
    void accept(Visitor v);
}

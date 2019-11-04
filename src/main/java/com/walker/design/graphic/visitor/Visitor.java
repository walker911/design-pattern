package com.walker.design.graphic.visitor;

/**
 * @author walker
 * @date 2019/11/1
 */
public abstract class Visitor {
    public abstract void visit(File file);

    public abstract void visit(Directory directory);
}

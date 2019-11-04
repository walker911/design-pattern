package com.walker.design.graphic.visitor;

import java.util.Iterator;

/**
 * 表示一个条目的抽象类
 *
 * @author walker
 * @date 2019/11/1
 */
public abstract class Entry implements Element {

    protected Entry parent;

    public abstract String getName();

    public abstract int getSize();

    public Entry add(Entry entry) {
        throw new FileTreatmentException();
    }

    public Iterator iterator() {
        throw new FileTreatmentException();
    }

    @Override
    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}

package com.walker.design.graphic.composite;

/**
 * 表示一个条目的抽象类
 *
 * @author walker
 * @date 2019/11/1
 */
public abstract class Entry {

    protected Entry parent;

    public abstract String getName();

    public abstract int getSize();

    public Entry add(Entry entry) {
        throw new FileTreatmentException();
    }

    public void printList() {
        printList("");
    }

    protected abstract void printList(String prefix);

    @Override
    public String toString() {
        return getName() + " (" + getSize() + ")";
    }

    public String getFullName() {
        StringBuffer fullname = new StringBuffer();
        Entry entry = this;
        do {
            fullname.insert(0, "/" + entry.getName());
            entry = entry.parent;
        } while (entry != null);

        return fullname.toString();
    }
}

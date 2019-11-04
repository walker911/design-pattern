package com.walker.design.graphic.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Composite 复合物
 *
 * @author walker
 * @date 2019/11/1
 */
public class Directory extends Entry {

    private String name;
    private List<Entry> directory = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {

        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        for (Entry entry : directory) {
            size += entry.getSize();
        }

        return size;
    }

    @Override
    public Iterator<Entry> iterator() {
        return directory.iterator();
    }

    @Override
    public Entry add(Entry entry) {
        directory.add(entry);
        entry.parent = this;
        return this;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}

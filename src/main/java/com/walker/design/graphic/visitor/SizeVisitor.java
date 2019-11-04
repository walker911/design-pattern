package com.walker.design.graphic.visitor;

import java.util.Iterator;

/**
 * @author walker
 * @date 2019/11/4
 */
public class SizeVisitor extends Visitor {

    private int size;

    @Override
    public void visit(File file) {
        size += file.getSize();
    }

    @Override
    public void visit(Directory directory) {
        Iterator<Entry> it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = it.next();
            entry.accept(this);
        }
    }
}

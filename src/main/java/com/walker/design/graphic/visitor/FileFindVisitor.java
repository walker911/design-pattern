package com.walker.design.graphic.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author walker
 * @date 2019/11/4
 */
public class FileFindVisitor extends Visitor {

    private String suffix;
    private List<File> files;

    public FileFindVisitor(String suffix) {
        this.suffix = suffix;
        this.files = new ArrayList<>();
    }

    @Override
    public void visit(File file) {
        if (file.getName().endsWith(suffix)) {
            files.add(file);
        }
    }

    @Override
    public void visit(Directory directory) {
        Iterator<Entry> it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = it.next();
            entry.accept(this);
        }
    }

    public Iterator<File> getFoundFiles() {
        return files.iterator();
    }
}

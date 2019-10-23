package com.walker.design.iterator;

import java.util.List;

/**
 * @author walker
 * @date 2019/3/26
 */
public class ProjectIterator implements IProjectIterator {

    private List<IProject> projects;

    private int currentItem = 0;

    public ProjectIterator(List<IProject> projects) {
        this.projects = projects;
    }

    @Override
    public boolean hasNext() {
        return this.currentItem < projects.size() && this.projects.get(currentItem) != null;
    }

    @Override
    public Object next() {
        return this.projects.get(currentItem++);
    }
}

package com.walker.design.zen.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author walker
 * @date 2019/3/26
 */
public class ProjectImpl implements IProject {

    private String name;

    private int num;

    private int cost;

    private List<IProject> projects = new ArrayList<>();

    public ProjectImpl() {
    }

    public ProjectImpl(String name, int num, int cost) {
        this.name = name;
        this.num = num;
        this.cost = cost;
    }

    @Override
    public void add(String name, int num, int cost) {
        this.projects.add(new ProjectImpl(name, num, cost));
    }

    @Override
    public String getProjectInfo() {
        StringBuilder builder = new StringBuilder();
        builder.append("project name: ")
                .append(this.name)
                .append("\tproject num: ")
                .append(this.num)
                .append("\tproject cost: ")
                .append(this.cost);
        return builder.toString();
    }

    @Override
    public IProjectIterator iterator() {
        return new ProjectIterator(this.projects);
    }
}

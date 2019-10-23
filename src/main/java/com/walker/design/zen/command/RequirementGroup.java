package com.walker.design.zen.command;

/**
 * @author walker
 * @date 2019/3/27
 */
public class RequirementGroup extends AbstractGroup {
    @Override
    public void find() {
        System.out.println("find requirement");
    }

    @Override
    public void add() {
        System.out.println("add requirement");
    }

    @Override
    public void delete() {
        System.out.println("delete requirement");
    }

    @Override
    public void change() {
        System.out.println("change requirement");
    }

    @Override
    public void plan() {
        System.out.println("plan requirement");
    }
}

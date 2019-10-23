package com.walker.design.command;

/**
 * @author walker
 * @date 2019/3/27
 */
public class CodeGroup extends AbstractGroup {
    @Override
    public void find() {
        System.out.println("find code");
    }

    @Override
    public void add() {
        System.out.println("add code");
    }

    @Override
    public void delete() {
        System.out.println("delete code");
    }

    @Override
    public void change() {
        System.out.println("change code");
    }

    @Override
    public void plan() {
        System.out.println("plan code");
    }
}

package com.walker.design.graphic.adapter;

/**
 * @author walker
 * @date 2019/10/25
 */
public class Banner {

    private String args;

    public Banner(String args) {
        this.args = args;
    }

    public void showWithParen() {
        System.out.println("(" + args + ")");
    }

    public void showWithAster() {
        System.out.println("*" + args + "*");
    }
}

package com.walker.design.graphic.adapter;

/**
 * @author walker
 * @date 2019/10/25
 */
public class PrintBanner extends Print {

    private Banner banner;

    public PrintBanner(String args) {
        this.banner = new Banner(args);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}

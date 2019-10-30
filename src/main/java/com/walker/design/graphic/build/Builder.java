package com.walker.design.graphic.build;

/**
 * Builder模式
 *
 * @author walker
 * @date 2019/10/29
 */
public interface Builder {
    void makeTitle(String title);
    void makeString(String str);
    void makeItems(String[] items);
    void close();
}

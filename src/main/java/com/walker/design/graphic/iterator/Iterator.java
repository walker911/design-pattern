package com.walker.design.graphic.iterator;

/**
 * 迭代器
 *
 * @author walker
 * @date 2019/10/25
 */
public interface Iterator {

    /**
     * 是否存在下一个元素
     *
     * @return
     */
    boolean hasNext();

    /**
     * 获取下一个元素
     *
     * @return
     */
    Object next();
}

package com.walker.design.iterator;

/**
 * @author walker
 * @date 2019/3/26
 */
public interface IProject {

    /**
     * add
     * @param name
     * @param num
     * @param cost
     */
    void add(String name, int num, int cost);

    /**
     * project info
     *
     * @return
     */
    String getProjectInfo();

    /**
     * iterator
     *
     * @return
     */
    IProjectIterator iterator();
}

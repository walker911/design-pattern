package com.walker.design.graphic.interpreter;

/**
 * @author walker
 * @date 2019/11/11
 */
public abstract class Node {
    public abstract void parse(Context context) throws ParseException;
}

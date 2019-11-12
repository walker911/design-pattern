package com.walker.design.graphic.interpreter.language;

/**
 * @author walker
 * @date 2019/11/11
 */
public abstract class Node implements Executor {
    public abstract void parse(Context context) throws ParseException;
}

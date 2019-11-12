package com.walker.design.graphic.interpreter.language;

/**
 * @author walker
 * @date 2019/11/12
 */
public interface ExecutorFactory {
    Executor createExecutor(String name);
}

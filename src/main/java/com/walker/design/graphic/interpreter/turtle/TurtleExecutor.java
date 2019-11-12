package com.walker.design.graphic.interpreter.turtle;

import com.walker.design.graphic.interpreter.language.Executor;

/**
 * @author walker
 * @date 2019/11/12
 */
public abstract class TurtleExecutor implements Executor {

    protected TurtleCanvas canvas;

    public TurtleExecutor(TurtleCanvas canvas) {
        this.canvas = canvas;
    }
}

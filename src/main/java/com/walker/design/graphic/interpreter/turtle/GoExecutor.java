package com.walker.design.graphic.interpreter.turtle;

import com.walker.design.graphic.interpreter.language.ExecuteException;

/**
 * @author walker
 * @date 2019/11/12
 */
public class GoExecutor extends TurtleExecutor {

    public GoExecutor(TurtleCanvas canvas) {
        super(canvas);
    }

    @Override
    public void execute() throws ExecuteException {
        canvas.go(TurtleCanvas.UNIT_LENGTH);
    }
}

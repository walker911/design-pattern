package com.walker.design.graphic.interpreter.turtle;

import com.walker.design.graphic.interpreter.language.ExecuteException;

/**
 * @author walker
 * @date 2019/11/12
 */
public class DirectionExecutor extends TurtleExecutor {

    private int relativeDirection;

    public DirectionExecutor(TurtleCanvas canvas, int relativeDirection) {
        super(canvas);
        this.relativeDirection = relativeDirection;
    }

    @Override
    public void execute() throws ExecuteException {
        canvas.setRelativeDirection(relativeDirection);
    }
}

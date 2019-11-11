package com.walker.design.graphic.command.command;

import com.walker.design.graphic.command.drawer.Drawable;

import java.awt.*;

/**
 * @author walker
 * @date 2019/11/11
 */
public class DrawCommand implements Command {

    protected Drawable drawable;
    private Point position;

    public DrawCommand(Drawable drawable, Point position) {
        this.drawable = drawable;
        this.position = position;
    }

    @Override
    public void execute() {
        drawable.draw(position.x, position.y);
    }
}

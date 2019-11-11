package com.walker.design.graphic.command.command;

import com.walker.design.graphic.command.drawer.Drawable;

import java.awt.*;

/**
 * @author walker
 * @date 2019/11/11
 */
public class ColorCommand implements Command {

    protected Drawable drawable;
    private Color color;

    public ColorCommand(Drawable drawable, Color color) {
        this.drawable = drawable;
        this.color = color;
    }

    @Override
    public void execute() {
        drawable.setColor(color);
    }
}

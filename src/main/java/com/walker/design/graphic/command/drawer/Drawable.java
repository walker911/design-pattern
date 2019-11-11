package com.walker.design.graphic.command.drawer;

import java.awt.*;

/**
 * @author walker
 * @date 2019/11/11
 */
public interface Drawable {

    void init();

    void draw(int x, int y);

    void setColor(Color color);
}

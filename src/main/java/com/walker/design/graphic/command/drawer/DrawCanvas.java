package com.walker.design.graphic.command.drawer;

import com.walker.design.graphic.command.command.ColorCommand;
import com.walker.design.graphic.command.command.MacroCommand;

import java.awt.*;

/**
 * @author walker
 * @date 2019/11/11
 */
public class DrawCanvas extends Canvas implements Drawable {

    private Color color;
    private int radius;
    private MacroCommand history;

    public DrawCanvas(int width, int height, MacroCommand history) {
        super.setSize(width, height);
        super.setBackground(Color.white);
        this.history = history;
        init();
    }

    @Override
    public void paint(Graphics g) {
        history.execute();
    }

    @Override
    public void init() {
        color = Color.red;
        radius = 6;
        history.append(new ColorCommand(this, color));
    }

    @Override
    public void draw(int x, int y) {
        Graphics g = super.getGraphics();
        g.setColor(color);
        g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }
}

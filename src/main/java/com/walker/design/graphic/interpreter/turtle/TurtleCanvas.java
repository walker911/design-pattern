package com.walker.design.graphic.interpreter.turtle;

import com.walker.design.graphic.interpreter.language.ExecuteException;
import com.walker.design.graphic.interpreter.language.Executor;
import com.walker.design.graphic.interpreter.language.ExecutorFactory;

import java.awt.*;

/**
 * @author walker
 * @date 2019/11/12
 */
public class TurtleCanvas extends Canvas implements ExecutorFactory {

    final static int UNIT_LENGTH = 30;
    final static int DIRECTION_UP = 0;
    final static int DIRECTION_RIGHT = 3;
    final static int DIRECTION_DOWN = 6;
    final static int DIRECTION_LEFT = 9;
    final static int RELATIVE_DIRECTION_RIGHT = 3;
    final static int RELATIVE_DIRECTION_LEFT = -3;
    final static int RADIUS = 3;
    private int direction = 0;
    private Point position;
    private Executor executor;

    public TurtleCanvas(int width, int height) {
        super.setSize(width, height);
        initialize();
    }

    public void setExecutor(Executor executor) {
        this.executor = executor;
    }

    void setRelativeDirection(int relativeDirection) {
        setDirection(direction + relativeDirection);
    }

    void setDirection(int direction) {
        if (direction < 0) {
            direction = direction - (-direction) % 12;
        } else {
            direction = direction % 12;
        }
        this.direction = direction % 12;
    }

    void go(int length) {
        int newx = position.x;
        int newy = position.y;
        switch (direction) {
            case DIRECTION_UP:
                newy -= length;
                break;
            case DIRECTION_DOWN:
                newy += length;
                break;
            case DIRECTION_LEFT:
                newx -= length;
                break;
            case DIRECTION_RIGHT:
                newx += length;
                break;
            default:
                break;
        }
        Graphics g = super.getGraphics();
        if (g != null) {
            g.drawLine(position.x, position.y, newx, newy);
            g.fillOval(newx - RADIUS, newy - RADIUS, RADIUS * 2 + 1, RADIUS * 2 + 1);
        }
        position.x = newx;
        position.y = newy;
    }

    public void initialize() {
        Dimension size = super.getSize();
        position = new Point(size.width / 2, size.height / 2);
        direction = 0;
        super.setForeground(Color.red);
        super.setBackground(Color.white);
        Graphics g = super.getGraphics();
        if (g != null) {
            g.clearRect(0, 0, size.width, size.height);
        }
    }

    @Override
    public void paint(Graphics g) {
        initialize();
        if (executor != null) {
            try {
                executor.execute();
            } catch (ExecuteException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public Executor createExecutor(String name) {
        if (name.equals("go")) {
            return new GoExecutor(this);
        } else if (name.equals("right")) {
            return new DirectionExecutor(this, RELATIVE_DIRECTION_RIGHT);
        } else if (name.equals("left")) {
            return new DirectionExecutor(this, RELATIVE_DIRECTION_LEFT);
        } else {
            return null;
        }
    }
}

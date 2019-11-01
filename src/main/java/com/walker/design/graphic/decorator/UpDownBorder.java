package com.walker.design.graphic.decorator;

/**
 * @author walker
 * @date 2019/11/1
 */
public class UpDownBorder extends Border {

    private char ch;

    public UpDownBorder(Display display, char ch) {
        super(display);
        this.ch = ch;
    }

    @Override
    public int getColumns() {
        return display.getColumns();
    }

    @Override
    public int getRows() {
        return 1 + display.getRows() + 1;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0 || row == display.getRows() + 1) {
            return makeLine(ch, display.getColumns());
        } else {
            return display.getRowText(row - 1);
        }
    }

    private String makeLine(char ch, int count) {
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < count; i++) {
            buffer.append(ch);
        }

        return buffer.toString();
    }
}

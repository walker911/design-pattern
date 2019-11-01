package com.walker.design.graphic.decorator;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/**
 * @author walker
 * @date 2019/11/1
 */
public class MultiStringDisplay extends Display {

    private List<String> strings;
    private int columns = 0;

    public MultiStringDisplay() {
        this.strings = new ArrayList<>();
    }

    @Override
    public int getColumns() {
        return columns;
    }

    @Override
    public int getRows() {
        return strings.size();
    }

    @Override
    public String getRowText(int row) {
        return strings.get(row);
    }

    public void add(String str) {
        strings.add(str);
        updateColumn(str);
    }

    private void updateColumn(String msg) {
        if (msg.getBytes().length > columns) {
            columns = msg.getBytes().length;
        }
        for (int i = 0; i < strings.size(); i++) {
            int fills = columns - strings.get(i).getBytes().length;
            if (fills > 0) {
                strings.set(i, strings.get(i) + spaces(fills));
            }
        }
    }

    private String spaces(int count) {
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < count; i++) {
            buffer.append(' ');
        }

        return buffer.toString();
    }
}

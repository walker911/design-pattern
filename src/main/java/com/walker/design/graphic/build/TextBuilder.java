package com.walker.design.graphic.build;

/**
 * @author walker
 * @date 2019/10/29
 */
public class TextBuilder implements Builder {

    private StringBuffer buffer = new StringBuffer();

    @Override
    public void makeTitle(String title) {
        buffer.append("============================\n");
        buffer.append("[" + title + "]");
        buffer.append("\n");
    }

    @Override
    public void makeString(String str) {
        buffer.append("■" + str + "\n");
        buffer.append("\n");
    }

    @Override
    public void makeItems(String[] items) {
        for (int i = 0; i < items.length; i++) {
            buffer.append("  ." + items[i] + "\n");
        }
        buffer.append("\n");
    }

    @Override
    public void close() {
        buffer.append("=============================\n");
    }

    public String getResult() {
        return buffer.toString();
    }
}

package com.walker.design.graphic.abstraction.list;

import com.walker.design.graphic.abstraction.factory.Item;
import com.walker.design.graphic.abstraction.factory.Tray;

import java.util.Iterator;

/**
 * 具体的零件
 *
 * @author walker
 * @date 2019/10/31
 */
public class ListTray extends Tray {
    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<li>\n");
        buffer.append(caption).append("\n");
        buffer.append("<ul>\n");
        Iterator<Item> iterator = tray.iterator();
        while (iterator.hasNext()) {
            Item item = iterator.next();
            buffer.append(item.makeHTML());
        }
        buffer.append("</ul>\n");
        buffer.append("</li>\n");

        return buffer.toString();
    }
}

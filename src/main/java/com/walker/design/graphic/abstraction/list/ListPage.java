package com.walker.design.graphic.abstraction.list;

import com.walker.design.graphic.abstraction.factory.Item;
import com.walker.design.graphic.abstraction.factory.Page;

import java.util.Iterator;

/**
 * 具体的产品
 *
 * @author walker
 * @date 2019/10/31
 */
public class ListPage extends Page {
    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<html><head><title>").append(title).append("</title></head>\n");
        buffer.append("<body>\n");
        buffer.append("<h1>").append(title).append("</h1>\n");
        buffer.append("<ul>\n");
        Iterator<Item> iterator = content.iterator();
        while (iterator.hasNext()) {
            Item item = iterator.next();
            buffer.append(item.makeHTML());
        }
        buffer.append("</ul>\n");
        buffer.append("<hr><address>").append(author).append("</address>");
        buffer.append("</body></html>\n");

        return buffer.toString();
    }
}

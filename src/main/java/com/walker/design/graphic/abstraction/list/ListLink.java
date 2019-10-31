package com.walker.design.graphic.abstraction.list;

import com.walker.design.graphic.abstraction.factory.Link;

/**
 * 具体的零件
 *
 * @author walker
 * @date 2019/10/31
 */
public class ListLink extends Link {
    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return " <li><a href=\"" + url + "\">" + caption + "</a></li>\n";
    }
}

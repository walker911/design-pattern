package com.walker.design.graphic.abstraction.list;

import com.walker.design.graphic.abstraction.factory.Factory;
import com.walker.design.graphic.abstraction.factory.Link;
import com.walker.design.graphic.abstraction.factory.Page;
import com.walker.design.graphic.abstraction.factory.Tray;

/**
 * 具体的工厂
 *
 * @author walker
 * @date 2019/10/30
 */
public class ListFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return null;
    }

    @Override
    public Tray createTray(String caption) {
        return null;
    }

    @Override
    public Page createPage(String title, String author) {
        return null;
    }
}

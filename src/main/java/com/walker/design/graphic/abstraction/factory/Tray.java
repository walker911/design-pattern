package com.walker.design.graphic.abstraction.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象的零件
 *
 * @author walker
 * @date 2019/10/30
 */
public abstract class Tray extends Item {
    private List<Item> tray = new ArrayList<>();

    public Tray(String caption) {
        super(caption);
    }

    public void add(Item item) {
        tray.add(item);
    }
}

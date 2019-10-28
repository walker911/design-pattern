package com.walker.design.graphic.factory.card;

import com.walker.design.graphic.factory.framework.Product;

/**
 * @author walker
 * @date 2019/10/28
 */
public class IDCard extends Product {

    private String owner;
    private int serial;

    IDCard(String owner, int serial) {
        System.out.println("制造 " + owner + "(" + serial + ")" + " 的ID卡");
        this.owner = owner;
        this.serial = serial;
    }

    @Override
    public void use() {
        System.out.println("使用 " + owner + "(" + serial + ")" + " 的ID卡");
    }

    public String getOwner() {
        return owner;
    }

    public int getSerial() {
        return serial;
    }
}

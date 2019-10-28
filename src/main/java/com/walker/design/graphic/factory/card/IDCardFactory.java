package com.walker.design.graphic.factory.card;

import com.walker.design.graphic.factory.framework.Factory;
import com.walker.design.graphic.factory.framework.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author walker
 * @date 2019/10/28
 */
public class IDCardFactory extends Factory {

    private List<String> owners = new ArrayList<>();
    private int serial = 100;
    private Map<Integer, String> database = new HashMap<>();

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner, serial++);
    }

    @Override
    protected void registerProduct(Product product) {
        IDCard card = (IDCard) product;
        owners.add(card.getOwner());
        database.put(card.getSerial(), card.getOwner());
    }

    public List<String> getOwners() {
        return owners;
    }
}

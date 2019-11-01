package com.walker.design.graphic.strategy.order;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author walker
 * @date 2019/11/1
 */
public class UserPayServiceStrategyFactory {

    private static Map<String, UserPayService> serviceMap = new ConcurrentHashMap<>();

    public static UserPayService getByUserType(String type) {
        return serviceMap.get(type);
    }

    public static void register(String type, UserPayService service) {
        serviceMap.put(type, service);
    }
}

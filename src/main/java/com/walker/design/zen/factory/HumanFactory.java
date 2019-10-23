package com.walker.design.zen.factory;

/**
 * @author walker
 * @date 2019/3/25
 */
public class HumanFactory extends AbstractHumanFactory {

    @Override
    @SuppressWarnings("unchecked")
    public <T extends Human> T createHuman(Class<T> clazz) {
        Human human = null;
        try {
            human = (Human) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) human;
    }
}

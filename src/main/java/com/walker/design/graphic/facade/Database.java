package com.walker.design.graphic.facade;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author walker
 * @date 2019/11/4
 */
public class Database {
    private Database() {
    }

    public static Properties getProperties(String dbname) {
        String filename = "E:\\project\\design-pattern\\src\\main\\java\\com\\walker\\design\\graphic\\facade\\" + dbname + ".txt";
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return properties;
    }
}

package com.walker.design.graphic.adapter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author walker
 * @date 2019/10/28
 */
public class FileProperties implements FileIO {

    private Properties properties;

    public FileProperties() {
        this.properties = new Properties();
    }

    @Override
    public void readFromFile(String filename) throws IOException {
        properties.load(new FileInputStream(new File(filename)));
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        properties.store(new FileOutputStream(new File(filename)), "written by FileProperties");
    }

    @Override
    public void setValue(String key, String value) {
        properties.setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return properties.getProperty(key);
    }
}

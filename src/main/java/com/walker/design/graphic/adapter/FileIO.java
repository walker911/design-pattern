package com.walker.design.graphic.adapter;

import java.io.IOException;

/**
 * @author walker
 * @date 2019/10/28
 */
public interface FileIO {

    void readFromFile(String filename) throws IOException;

    void writeToFile(String filename) throws IOException;

    void setValue(String key, String value);

    String getValue(String key);
}

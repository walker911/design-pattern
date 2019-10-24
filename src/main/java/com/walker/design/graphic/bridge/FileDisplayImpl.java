package com.walker.design.graphic.bridge;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author walker
 * @date 2019/10/24
 */
public class FileDisplayImpl extends DisplayImpl {

    private String filename;
    private BufferedReader reader;
    private final int MAX_READ_LIMIT = 4096;

    public FileDisplayImpl(String filename) {
        this.filename = filename;
    }

    @Override
    public void rawOpen() {
        try {
            reader = new BufferedReader(new FileReader(filename));
            reader.mark(MAX_READ_LIMIT);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("=-=-=-=-=-" + filename + "=-=-=-=-");
    }

    @Override
    public void rawPrint() {
        try {
            String line;
            // 回到mark位置
            reader.reset();
            while ((line = reader.readLine()) != null) {
                System.out.println("> " + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void rawClose() {
        System.out.println("=-=-=-=-");
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

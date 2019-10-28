package com.walker.design.graphic.adapter;

import java.io.IOException;

/**
 * @author walker
 * @date 2019/10/28
 */
public class FileMain {
    public static void main(String[] args) {
        try {
            FileIO f = new FileProperties();
            f.readFromFile("file.txt");
            System.out.println(f.getValue("year"));
            f.setValue("year", "2004");
            f.setValue("month", "4");
            f.setValue("day", "21");
            f.writeToFile("newFile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

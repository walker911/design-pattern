package com.walker.design.graphic.proxy;

/**
 * @author walker
 * @date 2019/11/11
 */
public interface Printable {
    /**
     * set name
     *
     * @param name
     */
    void setPrinterName(String name);

    /**
     * get name
     *
     * @return
     */
    String getPrinterName();

    /**
     * show name
     *
     * @param string
     */
    void print(String string);
}

package com.walker.design.zen.facade;

/**
 * @author walker
 * @date 2019/3/26
 */
public interface ILetterProcess {
    /**
     * write context
     *
     * @param context
     */
    void writeContext(String context);

    /**
     * fill envelope
     * @param address
     */
    void fillEnvelope(String address);

    /**
     * letter into envelope
     */
    void letterIntoEnvelope();

    /**
     * send letter
     */
    void sendLetter();
}

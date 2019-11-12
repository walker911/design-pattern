package com.walker.design.graphic.interpreter.language;

import java.util.StringTokenizer;

/**
 * @author walker
 * @date 2019/11/11
 */
public class Context implements ExecutorFactory {
    private ExecutorFactory factory;
    private StringTokenizer tokenizer;
    private String currentToken;

    public Context(String text) {
        tokenizer = new StringTokenizer(text);
        nextToken();
    }

    /**
     * 获取下个标记
     *
     * @return
     */
    public String nextToken() {
        if (tokenizer.hasMoreTokens()) {
            currentToken = tokenizer.nextToken();
        } else {
            currentToken = null;
        }

        return currentToken;
    }

    /**
     * 获取当前标记
     *
     * @return
     */
    public String currentToken() {
        return currentToken;
    }

    /**
     * 先检查当前标记，然后获取下一个标记
     *
     * @param token
     * @throws ParseException
     */
    public void skipToken(String token) throws ParseException {
        if (!token.equals(currentToken)) {
            throw new ParseException("Warning: " + token + "is expected, but " + currentToken + " is found.");
        }
        nextToken();
    }

    /**
     * 获取当前标记对应的数值
     *
     * @return
     * @throws ParseException
     */
    public int currentNumber() throws ParseException {
        int number = 0;
        try {
            number = Integer.parseInt(currentToken);
        } catch (NumberFormatException e) {
            throw new ParseException("Warning: " + e);
        }

        return number;
    }

    @Override
    public Executor createExecutor(String name) {
        return factory.createExecutor(name);
    }

    public void setExecutorFactory(ExecutorFactory factory) {
        this.factory = factory;
    }
}

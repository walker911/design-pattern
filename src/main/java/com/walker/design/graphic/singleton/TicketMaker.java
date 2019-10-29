package com.walker.design.graphic.singleton;

/**
 * @author walker
 * @date 2019/10/29
 */
public class TicketMaker {

    private int ticket = 1000;
    private static TicketMaker ticketMaker = new TicketMaker();

    private TicketMaker() {
    }

    public synchronized int getNextTicketNumber() {
        return ticket++;
    }

    public static TicketMaker getInstance() {
        return ticketMaker;
    }

    public static void main(String[] args) {
        TicketMaker t1 = TicketMaker.getInstance();
        TicketMaker t2 = TicketMaker.getInstance();
        System.out.println(t1 == t2);
        System.out.println(t1.getNextTicketNumber());
        System.out.println(t2.getNextTicketNumber());
    }
}

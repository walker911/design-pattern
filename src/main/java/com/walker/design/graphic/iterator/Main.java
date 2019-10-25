package com.walker.design.graphic.iterator;

/**
 * @author walker
 * @date 2019/10/25
 */
public class Main {
    public static void main(String[] args) {
        BookShelf shelf = new BookShelf(4);
        shelf.appendBook(new Book("Around the World in 80 days"));
        shelf.appendBook(new Book("Bible"));
        shelf.appendBook(new Book("Cinderella"));
        shelf.appendBook(new Book("Daddy-Long-Legs"));

        Iterator iterator = shelf.iterator();
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println(book.getName());
        }
    }
}

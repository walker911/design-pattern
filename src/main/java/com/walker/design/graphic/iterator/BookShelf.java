package com.walker.design.graphic.iterator;


import java.util.ArrayList;
import java.util.List;

/**
 * 书架类
 * 具体集合
 *
 * @author walker
 * @date 2019/10/25
 */
public class BookShelf implements Aggregate {

    private List<Book> books;

    public BookShelf(int initialSize) {
        this.books = new ArrayList<>(initialSize);
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public void appendBook(Book book) {
        books.add(book);
    }

    public int getLength() {
        return books.size();
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}

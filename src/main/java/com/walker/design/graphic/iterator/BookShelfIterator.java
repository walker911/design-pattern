package com.walker.design.graphic.iterator;

/**
 * 具体迭代器
 *
 * @author walker
 * @date 2019/10/25
 */
public class BookShelfIterator implements Iterator {

    private BookShelf shelf;
    private int index;

    public BookShelfIterator(BookShelf shelf) {
        this.shelf = shelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if (index < shelf.getLength()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object next() {
        Book book = shelf.getBookAt(index);
        index++;
        return book;
    }
}

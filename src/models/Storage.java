package models;

import java.io.Serializable;

public class Storage implements Serializable {
    private int quantity;
    private Book book;

    public Storage(int quantity, Book book) {
        this.quantity = quantity;
        this.book = book;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}

package models;

import java.io.Serializable;
import java.util.ArrayList;

public class Transaction implements Serializable {
    public static final int STATUS_BORROWED = 0;
    public static final int STATUS_RETURNED = 1;
    String id;
    BookReader bookReader;
    ArrayList<Book> books;
    String borrowDate;
    String returnDate;
    int status = STATUS_BORROWED;// 0: chua tra, 1: da tra

    public Transaction(
            String id,
            BookReader bookReader, ArrayList<Book> books,
                       String borrowDate,
                       String returnDate, int status) {
        this.id = id;
        this.bookReader = bookReader;
        this.books = books;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public BookReader getBookReader() {
        return bookReader;
    }

    public void setBookReader(BookReader bookReader) {
        this.bookReader = bookReader;
    }


    public String getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(String borrowDate) {
        this.borrowDate = borrowDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }
}

package com.example.pract2up.models;

import javax.xml.crypto.Data;
import java.util.Date;

public class Books {
    private int booksID;
    private String bookName;
    private String bookAuthor;
    private int publishYear;
    private int pageCount;

    public Books(int booksID, String bookName, String bookAuthor, int publishYear, int pageCount) {
        this.booksID = booksID;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.publishYear = publishYear;
        this.pageCount = pageCount;
    }

    public int getBooksID() {
        return booksID;
    }

    public void setBooksID(int booksID) {
        this.booksID = booksID;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
}

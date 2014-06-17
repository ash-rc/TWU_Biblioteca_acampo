package com.twu.biblioteca;

/**
 * Created by ashleycampo on 6/17/14.
 */
public class Book {
    String author;
    String year;
    String title;

    public Book(String a, String y, String t) {
        author = a;
        year = y;
        title = t;
    }

    public String toString() {
        return (title + "\t" + author + "\t" + year);
    }
}

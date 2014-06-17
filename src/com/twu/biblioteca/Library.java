package com.twu.biblioteca;

import java.util.ArrayList;

/**
 * Created by ashleycampo on 6/17/14.
 */
public class Library {
    ArrayList<Book> books = new ArrayList<Book>();

    public Library() {
        books.add(new Book("Head First Java", "Bill", "1924"));

    }
    public void displayWelcomeMessage() {
        System.out.println("Welcome to Biblioteca!");
    }

    public void listBooks() {
        for(Book b : books) {
            System.out.println(b.toString());
        }
    }
}

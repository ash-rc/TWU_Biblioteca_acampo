package com.twu.biblioteca;

import java.io.PrintStream;
import java.util.ArrayList;

/**
 * Created by ashleycampo on 6/17/14.
 */
public class Library {
    ArrayList<Book> books = new ArrayList<Book>();
    String[] menuOptions = {"List Books"};

    public Library() {
        books.add(new Book("Head First Java", "Bill", "1924"));
    }

    public void displayWelcomeMessage(PrintStream out) {
        out.println("Welcome to Biblioteca!");
    }

    public void listBooks(PrintStream out) {
        for(Book b : books) {
            out.println(b.toString());
        }
    }

    public void displayMenu(PrintStream out) {
        for (String option : menuOptions){
            out.println(option);
        }
    }
}

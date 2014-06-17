package com.twu.biblioteca;

import java.io.PrintStream;

/**
 * Created by ashleycampo on 6/17/14.
 */
public class Library {

    public void displayWelcomeMessage(PrintStream out) {
        out.println("Welcome to Biblioteca!");
    }

    public void listBooks(PrintStream out) {
        out.println("Head First Java\tBill\t1924");
    }
}

package com.twu.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by ashleycampo on 6/17/14.
 */
public class Library {

    ArrayList<Book> books = new ArrayList<Book>();
    ArrayList<String> menuOptions = new ArrayList<String>();
    private boolean hasQuit;

    public Library() {
        books.add(new Book("Head First Java", "Bill", "1924"));
        books.add(new Book("Game of Thrones", "J.R.R. Martin", "1992"));
        menuOptions.add("List Books");
        menuOptions.add("Quit");
    }

    public void displayWelcomeMessage(PrintStream out) {
        out.println("Welcome to Biblioteca!");
    }

    public void listBooks(PrintStream out) {
        for(Book b : books) {
            b.print(out);
        }
    }

    public void displayMenu(PrintStream out) {
        for (String option : menuOptions){
            out.println("(" + menuOptions.indexOf(option) + ") " + option);
        }
    }

    public void executeCommand(String command, PrintStream out) {
        out.println("Select a valid option!");
    }


    public void startTakingCommands(BufferedReader reader) throws IOException {
        String input;
        while (true){
            input = reader.readLine();
            if (input.equals("Quit")){
                break;
            }
        }
        hasQuit = true;
    }


    public boolean hasQuit() {
        return hasQuit;
    }
}

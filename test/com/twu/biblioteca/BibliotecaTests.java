package com.twu.biblioteca;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by ashleycampo on 6/17/14.
 */
public class BibliotecaTests {
    private Library library;
    private PrintStream mockStream;

    @Before
    public void setUp() {
        library = new Library();
        mockStream = mock(PrintStream.class);
    }

    @Test
    public void testWelcomeMessage() {

        library.displayWelcomeMessage(mockStream);
        verify(mockStream).println("Welcome to Biblioteca!");

    }

    @Test
    public void testListBooks() {
        library.listBooks(mockStream);
        verify(mockStream).printf("%-20s %-20s %-20s\n", "Head First Java", "Bill", "1924");
    }

    @Test
    public void testDisplayMenu(){
        library.displayMenu(mockStream);
        verify(mockStream).println("(0) List Books");
    }

    @Test
    public void checkInvalidInput() {
        library.executeCommand("bla", mockStream);

        verify(mockStream).println("Select a valid option!");
    }

    @Test
    public void testQuit() throws Exception {
        BufferedReader reader = mock(BufferedReader.class);
        when(reader.readLine()).thenReturn("Quit");
        library.startTakingCommands(reader);
        assertTrue(library.hasQuit());
    }
}

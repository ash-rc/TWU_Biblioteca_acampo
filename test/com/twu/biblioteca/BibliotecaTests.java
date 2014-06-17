package com.twu.biblioteca;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by ashleycampo on 6/17/14.
 */
public class BibliotecaTests {
    private Library library;

    @Before
    public void setUp() {
        library = new Library();
    }

    @Test
    public void testWelcomeMessage() {
        PrintStream mockStream = mock(PrintStream.class);

        library.displayWelcomeMessage(mockStream);

        verify(mockStream).println("Welcome to Biblioteca!");

    }

    @Test
    public void testListBooks() {
        PrintStream mockStream = mock(PrintStream.class);
        library.listBooks(mockStream);
        verify(mockStream).println("Head First Java\tBill\t1924");
    }
}

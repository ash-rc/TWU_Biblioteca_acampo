package com.twu.biblioteca;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Created by ashleycampo on 6/17/14.
 */
public class BibliotecaTests {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    Library library;

    @Before
    public void setUp() {
        library = new Library();
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUp() {
        System.setOut(null);
    }

    @Test
    public void testWelcomeMessage() {
        library.displayWelcomeMessage();
        Assert.assertEquals("Welcome to Biblioteca!\n", outContent.toString());

    }

    @Test
    public void testListBooks() {
        library.listBooks();

        Assert.assertEquals("Head First Java\n", outContent.toString());
    }
}

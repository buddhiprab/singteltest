package com.buddhi;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AnimalTest {

    private static final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private static final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private static final PrintStream originalOut = System.out;
    private static final PrintStream originalErr = System.err;

    private static Animal animal;

    @BeforeAll
    public static void init() {
        animal = new Animal();
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @AfterAll
    public static void end() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    public void testWalk() {
        animal.walk();
        assertEquals("Animal walking\n", outContent.toString());
    }
}
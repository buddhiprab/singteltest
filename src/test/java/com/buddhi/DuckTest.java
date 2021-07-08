package com.buddhi;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DuckTest {

    private static ByteArrayOutputStream outContent;
    private static final PrintStream originalOut = System.out;
    private static final PrintStream originalErr = System.err;

    private static Duck duck;

    @BeforeAll
    public static void init() {
        duck = new Duck();
    }

    @BeforeEach
    public void initEach() {
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void endEach() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    public void testSing() {
        duck.sing();
        assertEquals("Quack , quack\n", outContent.toString());
    }

    @Test
    public void testFly() {
        duck.swim();
        assertEquals("Duck swimming\n", outContent.toString());
    }
}
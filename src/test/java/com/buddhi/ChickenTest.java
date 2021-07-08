package com.buddhi;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChickenTest {

    private static final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private static final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private static final PrintStream originalOut = System.out;
    private static final PrintStream originalErr = System.err;

    private static Chicken chicken;

    @BeforeAll
    public static void init() {
        chicken = new Chicken();
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @AfterAll
    public static void end() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    public void testSing() {
        chicken.sing();
        assertEquals("Cluck, cluck\n", outContent.toString());
    }
}
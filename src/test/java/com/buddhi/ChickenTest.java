package com.buddhi;

import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChickenTest {

    private static ByteArrayOutputStream outContent;
    private static final PrintStream originalOut = System.out;
    private static final PrintStream originalErr = System.err;

    private static Chicken chicken;

    @BeforeAll
    public static void init() {
        chicken = new Chicken();
    }

    @BeforeEach
    public void initEach() {
        outContent  = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void endEach() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    public void testSing() {
        chicken.sing();
        assertEquals("Cluck, cluck\n", outContent.toString());
    }

    @Test
    public void testFly() {
        chicken.fly();
        assertEquals("", outContent.toString());
    }
}
package com.example;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
/**
 * Unit test for simple App.
 */
public class FizzBuzzTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStream(){
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStream(){
        System.setOut(originalOut);
    }

    @Test
    public void Divisible3(){
        FizzBuzz.fizzBuzz(9);
        assertEquals("FIZZ/n", outContent.toString());
    }
}

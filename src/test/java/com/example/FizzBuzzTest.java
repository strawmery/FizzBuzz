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
        assertEquals("FIZZ\r\n", outContent.toString());
    }
    @Test
    public void Divisible5(){
        FizzBuzz.fizzBuzz(10);
        assertEquals("BUZZ\r\n", outContent.toString());
    }
    @Test
    public void Divisible3and5(){
        FizzBuzz.fizzBuzz(15);
        assertEquals("FIZZBUZZ\r\n", outContent.toString());
    }

    @Test
    public void Nothing(){
        FizzBuzz.fizzBuzz(2);
        assertEquals("NADA\r\n", outContent.toString());
    }
}

package ru.ibs.junit;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    private static FileParser fileParser;

    @BeforeAll
    public static void init() {
        fileParser = new FileParser();
    }

    @Test
    public void FizzBuzzThreeTest() {
        assertEquals("Fizz", fileParser.fizzBuzzParser("3"));
    }

    @Test
    public void FizzBuzzFiveTest() {
        assertEquals("Buzz", fileParser.fizzBuzzParser("5"));
    }

    @Test
    public void FizzBuzzFifteenTest() {
        assertEquals("FizzBuzz", fileParser.fizzBuzzParser("15"));
    }

    @Test
    public void FizzBuzzAnotherNumberTest() {
        assertEquals("2", fileParser.fizzBuzzParser("2"));
    }
}

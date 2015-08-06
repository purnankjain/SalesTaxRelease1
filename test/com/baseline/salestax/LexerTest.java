package com.baseline.salestax;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class LexerTest {

    Lexer lexer;

    @Before
    public void initialise() {
        lexer = new Lexer(" ");
    }

    @Test
    public void shouldLexInput() {
        String input = "Hello World How";
        String[] tokens = {"Hello", "World", "How"};

        assertArrayEquals(tokens, lexer.lex(input));
    }
}

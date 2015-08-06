package com.baseline.salestax;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LexerTest {

    Lexer lexer;

    @Before
    public void initialise() {
        lexer = new Lexer(" ");
    }

    @Test
    public void shouldLexInput() {
        String input = "Hello World How";
        ArrayList<String> tokens = new ArrayList<String>();
        tokens.add("Hello");
        tokens.add("World");
        tokens.add("How");

        assertEquals(tokens.toString(), lexer.lex(input).toString());
    }
}

package com.baseline.salestax;

public class Lexer {

    String splitter;

    public Lexer(String splitter) {
        this.splitter = splitter;
    }

    public String[] lex(String input) {
        return input.split(splitter);
    }
}

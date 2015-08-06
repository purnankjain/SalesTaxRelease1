package com.baseline.salestax;

import java.util.ArrayList;

public class Lexer {

    String splitter;

    public Lexer(String splitter) {
        this.splitter = splitter;
    }

    public ArrayList<String> lex(String input) {
        String[] tokens = input.split(splitter);
        ArrayList<String> tokensArray = new ArrayList<String>();
        for(String token : tokens) {
            tokensArray.add(token);
        }
        return tokensArray;
    }
}

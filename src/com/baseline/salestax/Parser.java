package com.baseline.salestax;

import java.util.ArrayList;

public class Parser {

    TaxCalculator taxCalculator;
    Lexer lexer;

    public Parser(TaxCalculator taxCalculator, Lexer lexer) {
        this.taxCalculator = taxCalculator;
        this.lexer = lexer;
    }

    public PurchasedItem parseItem(String input) {
        ArrayList<String> inputTokens = lexer.lex(input);
        int count = Integer.parseInt(inputTokens.get(0));
        double price = Double.parseDouble(inputTokens.get(inputTokens.size() - 1));
        ArrayList<String> itemTokens = new ArrayList<String>();
        for (int i = 1; i < inputTokens.size() - 1; i++) {
            itemTokens.add(inputTokens.get(i));
        }
        double taxPerItem = taxCalculator.calculateTaxForItem(itemTokens, price);
        return new PurchasedItem(count, itemTokens, price, taxPerItem);
    }
}

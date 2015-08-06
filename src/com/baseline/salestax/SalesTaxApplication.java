package com.baseline.salestax;

public class SalesTaxApplication {
    ItemCategory itemCategory;
    InputView inputView;
    Lexer lexer;

    public SalesTaxApplication(ItemCategory itemCategory, InputView inputView, Lexer lexer) {
        this.itemCategory = itemCategory;
        this.inputView = inputView;
        this.lexer = lexer;
    }

    public void start() {
        System.out.println("Enter Number of Items : ");
        int count = Integer.parseInt(inputView.readline());
        String input;
        String[] tokens;
        while(count > 0) {
            input = inputView.readline();
            tokens = lexer.lex(input);
            count--;
        }
    }
}

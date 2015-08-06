package com.baseline.salestax;

public class SalesTaxApplication {
    ItemCategory itemCategory;
    InputView inputView;

    public SalesTaxApplication(ItemCategory itemCategory, InputView inputView) {
        this.itemCategory = itemCategory;
        this.inputView = inputView;
    }

    public void start() {
        System.out.println("Enter Number of Items : ");
        int count = Integer.parseInt(inputView.readline());
        String input;
        while(count > 0) {
            count--;
        }
    }
}

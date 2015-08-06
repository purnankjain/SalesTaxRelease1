package com.baseline.salestax;

import java.util.ArrayList;

public class ItemCategory {
    protected ArrayList<String> item;
    protected double salesTaxRate;

    public ItemCategory(ArrayList<String> item, double salesTaxRate) {
        this.item = item;
        this.salesTaxRate = salesTaxRate / 100;
    }

    public double calculateTax(double price) {
        return (price * salesTaxRate);
    }
}

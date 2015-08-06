package com.baseline.salestax;

import java.util.ArrayList;

public class ItemCategory {
    protected ArrayList<String> items;
    protected double salesTaxRate;
    private int categoryPreference;

    public ItemCategory(ArrayList<String> items, double salesTaxRate) {
        this.items = items;
        this.salesTaxRate = salesTaxRate / 100;
    }

    public double calculateTax(double price) {
        return (price * salesTaxRate);
    }

    public boolean hasItem(String thatItem) {
        for(String thisItem : items) {
            if(thisItem.equals(thatItem)) {
                return true;
            }
        }
        return false;
    }
}

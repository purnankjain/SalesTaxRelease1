package com.baseline.salestax;

import java.util.ArrayList;

public class EntryPoint {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<String>();
        items.add("Chocolate");
        ItemCategory itemCategory = new ItemCategory(items, 10);
        SalesTaxApplication salesTaxApplication = new SalesTaxApplication(itemCategory);
        salesTaxApplication.start();
    }
}

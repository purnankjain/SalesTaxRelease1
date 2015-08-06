package com.baseline.salestax;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class EntryPoint {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<String>();
        items.add("Chocolate");
        ItemCategory itemCategory = new ItemCategory(items, 10);
        InputView inputView = new InputView(new BufferedReader(new InputStreamReader(System.in)));
        SalesTaxApplication salesTaxApplication = new SalesTaxApplication(itemCategory, inputView);
        salesTaxApplication.start();
    }
}

package com.baseline.salestax;

import java.util.ArrayList;

public class TaxCalculator {
    ArrayList<ItemCategory> itemCategories;

    public TaxCalculator(ArrayList<ItemCategory> itemCategories) {
        this.itemCategories = itemCategories;
    }

    public double calculateTaxForItem(ArrayList<String> itemTokens, double price) {
        ItemCategory itemCategory = findItemCategory(itemTokens);
        return itemCategory.calculateTax(price);
    }

    private ItemCategory findItemCategory(ArrayList<String> itemTokens) {
        if(itemTokens.get(0).equals("imported")) {
            return itemCategories.get(0);
        }
        else
        {
            String item = "";
            for(String str : itemTokens) {
                item += str;
            }
            for(ItemCategory itemCategory : itemCategories) {
                if(itemCategory.hasItem(item)) {
                    return itemCategory;
                }
            }
            return itemCategories.get(itemCategories.size() - 1);
        }
    }
}

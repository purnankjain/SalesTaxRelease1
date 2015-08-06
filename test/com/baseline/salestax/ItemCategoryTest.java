package com.baseline.salestax;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ItemCategoryTest {

    ItemCategory itemCategory;
    ArrayList<String> items;
    int rate;
    double errorMargin;

    @Before
    public void initialise() {
        items = new ArrayList<String>();
        items.add("Chocolate");
        rate = 10;
        errorMargin = 0;
        itemCategory = new ItemCategory(items, rate);
    }

    @Test
    public void shouldCalculateTax() {
        double price = 100;

        assertEquals(10, itemCategory.calculateTax(price), errorMargin);
    }
}

package com.baseline.salestax;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TaxCalculatorTest {

    TaxCalculator taxCalculator;
    ArrayList<ItemCategory> itemCategories;
    ItemCategory itemCategory;
    ArrayList<String> itemTokens;
    double price;

    @Before
    public void initialise() {
        itemCategories = new ArrayList<ItemCategory>();
        itemTokens = new ArrayList<String>();
        itemTokens.add("Book");
        price = 10;
        itemCategory = mock(ItemCategory.class);
        itemCategories.add(itemCategory);
        taxCalculator = new TaxCalculator(itemCategories);
    }

    @Test
    public void shouldCalculateTestAccordingToItem() {
        when(itemCategory.hasItem(itemTokens.get(0))).thenReturn(true);
        when(itemCategory.calculateTax(price)).thenReturn(1.2);

        assertEquals(1.2, taxCalculator.calculateTaxForItem(itemTokens, price), 0.0);
    }
}

package com.baseline.salestax;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PurchasedItemTest {

    PurchasedItem purchasedItem;
    String[] details;
    int count;
    double price;
    double errorMargin;
    double taxAmountPerItem;

    @Before
    public void initialise() {
        details = new String[1];
        count = 1;
        price = 10;
        errorMargin = 0.0;
        taxAmountPerItem = 10.0;
        purchasedItem = new PurchasedItem(count, details, price, taxAmountPerItem);
    }

    @Test
    public void shouldCalculateTotalPrice() {
        assertEquals(20.0, purchasedItem.calculateTotalAmountForItem(), errorMargin);

    }
}

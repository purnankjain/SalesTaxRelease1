package com.baseline.salestax;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ParserTest {

    Parser parser;
    Lexer lexer;
    TaxCalculator taxCalculator;
    PurchasedItem purchasedItem;
    String input;


    @Before
    public void initialise() {
        taxCalculator = mock(TaxCalculator.class);
        lexer = mock(Lexer.class);
        input = "1 asdsads 10.0";
        parser = new Parser(taxCalculator, lexer);
        purchasedItem = new PurchasedItem(1, null, 10.0, 0.0);
    }

    @Test
    public void shouldParseAnInputToPurchasedItemObject() {
        ArrayList<String> str = new ArrayList<String>();
        str.add("1");
        str.add("asdsads");
        str.add("10.0");
        double price = 10.0;
        when(lexer.lex(input)).thenReturn(str);
        when(taxCalculator.calculateTaxForItem(str, price)).thenReturn(0.0);

        assertEquals(PurchasedItem.class, parser.parseItem(input).getClass());
    }
}

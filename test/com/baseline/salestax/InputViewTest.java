package com.baseline.salestax;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;

import static org.junit.Assert.assertEquals;

public class InputViewTest {

    InputView inputView;
    ByteArrayInputStream byteArrayInputStream;
    BufferedReader bufferedReader;
    String text;

    @Before
    public void initialise() {
        text = "hello";
        byteArrayInputStream = new ByteArrayInputStream(text.getBytes());
        bufferedReader = new BufferedReader(new InputStreamReader(byteArrayInputStream));
        inputView = new InputView(bufferedReader);
    }

    @Test
    public void shouldTakeCorrectInput() {
        assertEquals(text, inputView.readline());
    }
}

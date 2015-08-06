package com.baseline.salestax;

import java.io.BufferedReader;

public class InputView {
    BufferedReader bufferedReader;

    public InputView(BufferedReader bufferedReader) {
        this.bufferedReader = bufferedReader;
    }

    public String readline() {
        try {
            return bufferedReader.readLine();
        }
        catch(Exception e) {

        }
        return null;
    }
}

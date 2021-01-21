package com.example.test;

public class ExpleTwo {

    public void ninenine(int x, int y) {
        for (; x < 9; x++) {
            for (; y < 9; y++) {
                System.out.print(x + "*" + y + "=" + x * y + "\t");
                y=0;
            }

        }
    }

}

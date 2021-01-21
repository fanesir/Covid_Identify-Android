package com.example.test;

import java.util.Scanner;

class Accout_Money {
    int Money;

    public Accout_Money(int Money) {
        this.Money = Money;
    }
}

class Chiosdoint {
    int chios;

    public Chiosdoint(int chios) {
        this.chios = chios;
        if (chios == 0) {

        }

    }


}


class RubErrorMessage {
    int chios;


}

public class Exple {
    public static void main(String[] args) {
        int chios;
        System.out.println("simple accout computer");
        System.out.println("First Money 100$");
        Accout_Money accout_money = new Accout_Money(100);
        System.out.println("Save or Take ?");
        Scanner scanner = new Scanner(System.in);
        chios = scanner.nextInt();
        Chiosdoint chiosdoint = new Chiosdoint(chios);
    }
}
// for (x=1; x <= 9; x++) {
//         for (y=1; y <= 9; y++) {
//         System.out.print(x + "*" + y + "=" + x * y + "\t");
//         }
//         System.out.println();
//         }

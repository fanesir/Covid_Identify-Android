package com.example.test;

class Thisclass { // 抽象類別
    public void show() {

    }// 抽象方法

}

abstract class Parent { // 抽象類別
    abstract void show(); // 抽象方法

    int i = 30;

    public Parent(String str) {
        System.out.print("i am the Parent" + str);
    }

}

abstract class Parent2 { // 抽象類別
    abstract void show(); // 抽象方法

    int i1 = 30;


}

interface I1 {
    void show(String s);

}


class Grandson implements I1 {
    @Override
    public void show(String s) {
        System.out.print(s);
    }
}

public class Main {
    public static void main(String[] args) {
        Grandson gg  = new Grandson();
        gg.show("55");
    }


}
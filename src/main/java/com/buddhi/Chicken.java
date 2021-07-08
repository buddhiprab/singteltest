package com.buddhi;

public class Chicken extends Bird implements Singable {
    public void sing() {
        System.out.println("Cluck, cluck");
    }

    public void fly() {
//        System.out.println("cannot fly");
    }
}

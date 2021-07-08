package com.buddhi;

class Bird extends Animal implements Flyable, Singable {
    public void fly() {
        System.out.println("Bird flying");
    }

    public void sing() {
        System.out.println("Bird singing");
    }
}
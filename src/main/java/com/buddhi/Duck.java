package com.buddhi;

public class Duck implements Singable, Swimmable {

    public void sing() {
        System.out.println("Quack , quack");
    }

    public void swim() {
        System.out.println("Duck swimming");
    }
}

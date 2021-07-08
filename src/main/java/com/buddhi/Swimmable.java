package com.buddhi;

public interface Swimmable {
    default void swim() {
        System.out.println("default swim");
    }
}

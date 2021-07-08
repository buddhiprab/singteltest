package com.buddhi;

public interface Flyable {
    default void fly() {
        System.out.println("default fly");
    };
}

package com.buddhi;

public interface Walkable {
    default void walk() {
        System.out.println("default walk");
    };
}

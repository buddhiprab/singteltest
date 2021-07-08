package com.buddhi;

public interface Singable {
    default void sing() {
        System.out.println("default sing");
    };
}

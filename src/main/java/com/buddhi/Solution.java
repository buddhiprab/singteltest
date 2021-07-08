package com.buddhi;

public class Solution {
    public static void main(String[] args) {
        Bird chicken = new Chicken();
        chicken.sing();
        chicken.fly();

        Duck duck = new Duck();
        duck.swim();
        duck.sing();

        Rooster rooster = new Rooster();
        rooster.sing();
    }
}
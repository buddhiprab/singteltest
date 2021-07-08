package com.buddhi;

import com.buddhi.sounds.CatSound;
import com.buddhi.sounds.DogSound;
import com.buddhi.sounds.RoosterSound;
import sun.jvm.hotspot.debugger.windbg.DLL;

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

        Parrot parrot1 = new Parrot(new DogSound());
        parrot1.sing();

        Parrot parrot2 = new Parrot(new CatSound());
        parrot2.sing();

        Parrot parrot3 = new Parrot(new RoosterSound());
        parrot3.sing();

        Shark shark = new Shark();
        shark.eat();
        ClownFish clownFish = new ClownFish();
        clownFish.makeJoke();

        Dolphin dolphin = new Dolphin();
        dolphin.swim();
    }
}
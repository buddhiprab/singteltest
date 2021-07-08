package com.buddhi;

import com.buddhi.sounds.RoosterSound;

public class Rooster extends Bird implements Singable {
    public void sing() {
        System.out.println(new RoosterSound().getSound());
    }

    public void fly() {
//        System.out.println("cannot fly");
    }
}

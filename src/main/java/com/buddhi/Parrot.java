package com.buddhi;

import com.buddhi.sounds.Sound;

public class Parrot implements Singable {
    private Sound sound;

    Parrot(Sound sound) {
        this.sound = sound;
    }

    @Override
    public void sing() {
        System.out.println(sound.getSound());
    }
}

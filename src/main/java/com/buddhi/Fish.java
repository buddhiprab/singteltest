package com.buddhi;

import com.buddhi.colors.Colour;
import com.buddhi.sizes.Size;

public class Fish implements Swimmable {
    Size size;
    Colour colour;

    public void swim() {
        System.out.println("fish swimming");
    }
}

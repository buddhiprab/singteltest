package com.buddhi;

import com.buddhi.colors.Colour;
import com.buddhi.colors.Grey;
import com.buddhi.sizes.Large;
import com.buddhi.sizes.Size;

public class Shark extends Fish {
    Shark() {
        this.size = new Large();
        this.colour = new Grey();
    }

    public void swim() {
        System.out.println("shark swimming");
    }

    public void eat() {
        System.out.println("eat other fish");
    }
}

package com.buddhi;

import com.buddhi.colors.Colour;
import com.buddhi.colors.Grey;
import com.buddhi.colors.Orange;
import com.buddhi.sizes.Large;
import com.buddhi.sizes.Size;
import com.buddhi.sizes.Small;

public class ClownFish extends Fish {
    ClownFish() {
        this.size = new Small();
        this.colour = new Orange();
    }

    public void swim() {
        System.out.println("shark swimming");
    }
}

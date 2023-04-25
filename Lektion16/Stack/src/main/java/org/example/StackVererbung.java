package org.example;


import org.example.StackInterface;

import java.util.ArrayList;

//Klasse zum Upload ins e-learning
@SuppressWarnings("all")
public class StackVererbung extends ArrayList implements StackInterface {
    public boolean push(Object o) {
        return super.add(o);
    }

    public Object pop() {
        return super.remove(super.size() - 1);
    }

}

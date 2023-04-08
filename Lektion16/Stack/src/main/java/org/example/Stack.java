package org.example;

import java.util.ArrayList;

public class Stack implements StackInterface {

    ArrayList<Object> list = new ArrayList<>();

    public boolean push(Object o){
        return list.add(o);
    }

    public Object pop() {
        return list.remove(list.size()-1);
    }

}
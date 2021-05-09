package com.overriding_overloading;

public class GermanShepherd extends Dog{
    @Override
    public void bark() {
        System.out.println("Woof Woof Woof");
    }
}

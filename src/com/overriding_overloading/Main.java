package com.overriding_overloading;

public class Main {
    public static void main(String[] args) {

        // overriding
        GermanShepherd rockie = new GermanShepherd();
        rockie.bark();

        System.out.println();

        //overloading
        Calculations c = new Calculations();
        c.sum();
        c.sum(5,6);
    }
}

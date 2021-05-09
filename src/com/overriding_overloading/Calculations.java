package com.overriding_overloading;

public class Calculations {
    public void sum() {
        System.out.println("It has no parameters");
    }
    public void sum(int a, int b) {
        int ans = a+b;
        System.out.println("The sum is : "+ans);
    }
}

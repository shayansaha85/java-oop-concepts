package com.static_instance_methods;

public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        Calculator.printSum(5,6); // static method
        c.printMultiplication(6,7); // instance method because it runs through the instance of the Calculator class i.e. 'c'
    }
}

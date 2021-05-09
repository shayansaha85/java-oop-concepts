package com.static_instance_var;

class Dog {
    private static String name;

    public Dog(String name) {
        Dog.name = name;
    }
    public void printName() {
        System.out.println(name);
    }
}
public class Static_vars {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Rocky");
        Dog dog2 = new Dog("Brewman");

        dog1.printName();
        dog2.printName();
    }
}

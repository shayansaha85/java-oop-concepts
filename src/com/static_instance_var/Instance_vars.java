package com.static_instance_var;

class Cat {
    private String name;
    public Cat(String name) {
        this.name = name;
    }
    public void printName() {
        System.out.println(name);
    }
}
public class Instance_vars {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Rocky");
        Cat cat2 = new Cat("Brewman");

        cat1.printName();
        cat2.printName();
    }
}

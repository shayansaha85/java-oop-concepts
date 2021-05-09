package com.inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal",1,1,5,5);
        Dog dog = new Dog("Yorki",8,20,2,4,1,20, "silky");
        dog.eat();
        System.out.println();
        dog.move();
        System.out.println("Name : "+dog.getName());
        System.out.println("Brain : "+dog.getBrain());
    }
}

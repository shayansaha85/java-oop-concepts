package com.composition;

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("220B","Dell","240W",dimensions);
        Monitor monitor = new Monitor("27inch Beast","LG",27, new Resolution(2540,1440));
        Motherboard motherboard = new Motherboard("BJ-200","Asus",16, 6, "v2.44");

        PC thePC = new PC(theCase, monitor, motherboard);
        thePC.powerUp();

  }
}

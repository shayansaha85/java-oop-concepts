package com.composition;

class Wall {
    private String direction;

    public Wall(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }
}

class Ceilling {
    private int height;
    private String color;

    public Ceilling(int height, String color) {
        this.height = height;
        this.color = color;
    }
    public int getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }
}

class Bed {
    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private int quilt;

    public Bed(String style, int pillows, int height, int sheets, int quilt) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
    }
    public void make() {
        System.out.println("Bed.class -> make()");
    }
    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilt() {
        return quilt;
    }
}

class Lamp {
    private String style;
    private boolean battery;
    private int rating;

    public Lamp(String style, boolean battery, int rating) {
        this.style = style;
        this.battery = battery;
        this.rating = rating;
    }
    public void turnOn() {
        System.out.println("The lamp is turned on");
    }

    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getRating() {
        return rating;
    }
}

class Bedroom {
    private String name;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Ceilling ceilling;
    private Bed bed;
    private Lamp lamp;

    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceilling ceilling, Bed bed, Lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceilling = ceilling;
        this.bed = bed;
        this.lamp = lamp;
    }
    public void makeBed() {
        System.out.println("Bedroom.class -> makeBed()");
        bed.make();
    }
    public Lamp getLamp() {
        return this.lamp;
    }
}

class Assignment {
    public static void main(String[] args) {
        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("North");
        Wall wall4 = new Wall("South");

        Ceilling ceilling = new Ceilling(6,"white");
        Bed bed = new Bed("Royal",2,1,1,1);
        Lamp lamp = new Lamp("Classic",false,75);

        Bedroom bedroom = new Bedroom("Shayan's bedroom",wall1,wall2,wall3,wall4,ceilling,bed,lamp);
        bedroom.getLamp().turnOn();
        bedroom.makeBed();
    }
}
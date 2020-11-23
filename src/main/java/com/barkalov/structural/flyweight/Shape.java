package com.barkalov.structural.flyweight;

public interface Shape {
    void draw(int x, int y);
}

class Point implements Shape{
    @Override
    public void draw(int x, int y) {
        System.out.println("(" + x + "," + y + "): draw point");
    }
}

class Circle implements Shape{
    int radius = 5;
    @Override
    public void draw(int x, int y) {
        System.out.println("(" + x + "," + y + "): draw circle with radius " + radius);
    }
}

class Square implements Shape{
    int side = 10;
    @Override
    public void draw(int x, int y) {
        System.out.println("(" + x + "," + y + "): draw square with sides " + side);
    }
}
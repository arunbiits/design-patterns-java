package io.arun.learning.design.core.creational.prototype.example1;

public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Rectangle draw() method called...");
    }

}

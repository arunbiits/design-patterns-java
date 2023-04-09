package io.arun.learning.design.core.creational.prototype.example1;

public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Circle draw() method called...");
    }

}

package io.arun.learning.design.core.creational.prototype.example1;

public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Square draw() method called...");
    }

}

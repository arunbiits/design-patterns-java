package io.arun.learning.design.core.creational.prototype.example1;

public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape circle = ShapeCache.getShape("1");
        System.out.println("Shape: " + circle.getType());

        Shape square = ShapeCache.getShape("2");
        System.out.println("Shape: " + square.getType());

        Shape rectangle = ShapeCache.getShape("3");
        System.out.println("Shape: " + rectangle.getType());
    }
}

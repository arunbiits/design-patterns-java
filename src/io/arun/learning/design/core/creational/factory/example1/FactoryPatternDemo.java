package io.arun.learning.design.core.creational.factory.example1;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape circle = factory.getShape("circle");
        circle.draw();//prints 'Circle draw() method called...'

        Shape square = factory.getShape("square");
        square.draw();//prints 'Square draw() method called...'

        Shape rectangle = factory.getShape("rectangle");
        rectangle.draw();//prints 'Rectangle draw() method called...'

    }
}

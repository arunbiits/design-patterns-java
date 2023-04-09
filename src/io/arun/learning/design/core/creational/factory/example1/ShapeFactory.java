package io.arun.learning.design.core.creational.factory.example1;

public class ShapeFactory {

    public Shape getShape(String type) {
        if(type != null) {
            if (type.equals("circle")) {
                return new Circle();
            } else if (type.equals("square")) {
                return new Square();
            } else if (type.equals("rectangle")) {
                return new Rectangle();
            }
        }
        return null;
    }

}

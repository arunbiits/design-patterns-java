package io.arun.learning.design.core.creational.abstractfactory.example1;

public class ShapeFactory extends AbstractShapeFactory{
    @Override
    Shape getShape(String type) {
        if(type != null) {
            if(type.equals("rectangle")) {
                return new Rectangle();
            }else if(type.equals("square")) {
                return new Square();
            }
        }
        return null;
    }
}

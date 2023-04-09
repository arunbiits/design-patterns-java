package io.arun.learning.design.core.creational.abstractfactory.example1;

public class RoundedShapeFactory extends AbstractShapeFactory{
    @Override
    Shape getShape(String type) {
        if(type != null) {
            if(type.equals("rectangle")) {
                return new RoundedRectangle();
            }else if(type.equals("square")) {
                return new RoundedSquare();
            }
        }
        return null;
    }
}

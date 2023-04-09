package io.arun.learning.design.core.creational.abstractfactory.example1;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractShapeFactory shapeFactory = FactoryProducer.getFactory(false);

        Shape rectangle = shapeFactory.getShape("rectangle");
        rectangle.draw();

        Shape square = shapeFactory.getShape("square");
        square.draw();

        AbstractShapeFactory roundedShapeFactory = FactoryProducer.getFactory(true);

        Shape roundedRectangle = roundedShapeFactory.getShape("rectangle");
        roundedRectangle.draw();

        Shape roundedSquare = roundedShapeFactory.getShape("square");
        roundedSquare.draw();
    }
}

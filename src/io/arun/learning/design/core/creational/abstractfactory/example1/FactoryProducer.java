package io.arun.learning.design.core.creational.abstractfactory.example1;

public class FactoryProducer {
    public static AbstractShapeFactory getFactory(boolean isRounded) {
        if(isRounded) {
            return new RoundedShapeFactory();
        }
        return new ShapeFactory();
    }
}

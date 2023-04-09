package io.arun.learning.design.core.creational.factory.example2;

public abstract class Plan {
    abstract double getRate();

    public void calculateBill(int units) {
        System.out.println(units * getRate());
    }
}

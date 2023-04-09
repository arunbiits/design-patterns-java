package io.arun.learning.design.core.creational.factory.example2;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        PlanFactory factory = new PlanFactory();

        Plan domesticPlan = factory.getPlan("domestic");
        domesticPlan.calculateBill(10);//prints 35.0

        Plan commercialPlan = factory.getPlan("commercial");
        commercialPlan.calculateBill(10);//prints 75.0

        Plan institutionalPlan = factory.getPlan("institutional");
        institutionalPlan.calculateBill(10);//prints 55.0
    }
}

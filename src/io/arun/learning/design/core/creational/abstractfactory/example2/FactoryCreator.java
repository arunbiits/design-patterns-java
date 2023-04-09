package io.arun.learning.design.core.creational.abstractfactory.example2;

public class FactoryCreator {
    public static AbstractFactory getFactory(String type) {
        if(type != null) {
            if(type.equals("bank")) {
                return new BankFactory();
            }else if(type.equals("loan")) {
                return new LoanFactory();
            }
        }
        return null;
    }
}

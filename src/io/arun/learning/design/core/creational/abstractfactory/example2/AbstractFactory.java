package io.arun.learning.design.core.creational.abstractfactory.example2;

public abstract class AbstractFactory {
    public abstract Bank getBank(String bank);
    public abstract Loan getLoan(String type);
}

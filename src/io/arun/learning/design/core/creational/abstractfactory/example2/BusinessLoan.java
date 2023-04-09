package io.arun.learning.design.core.creational.abstractfactory.example2;

public class BusinessLoan extends Loan {
    @Override
    double getInterestRate() {
        return 7.5;
    }
}

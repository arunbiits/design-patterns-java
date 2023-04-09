package io.arun.learning.design.core.creational.abstractfactory.example2;

public abstract class Loan {
    abstract double getInterestRate();

    public void calculateLoanPayment(double loanAmount, int years) {
        double rate = getInterestRate();
        int n = years * 12;
        rate /= 1200;
        double emi = ((rate*Math.pow((1+rate),n))/((Math.pow((1+rate),n))-1))*loanAmount;
        System.out.println("Your monthly EMI is " + emi);
    }
}

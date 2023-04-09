package io.arun.learning.design.core.creational.abstractfactory.example2;

public class AbastractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory bankFactory = FactoryCreator.getFactory("bank");

        Bank sbi = bankFactory.getBank("SBI");
        System.out.println(sbi.getBankName());

        AbstractFactory loanFactory = FactoryCreator.getFactory("loan");

        Loan educationLoan = loanFactory.getLoan("education");
        educationLoan.calculateLoanPayment(500000, 5);
    }
}

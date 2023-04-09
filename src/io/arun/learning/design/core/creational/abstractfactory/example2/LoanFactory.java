package io.arun.learning.design.core.creational.abstractfactory.example2;

public class LoanFactory extends AbstractFactory {
    @Override
    public Bank getBank(String bank) {
        return null;
    }

    @Override
    public Loan getLoan(String type) {
        if(type != null) {
            if(type.equals("home")) {
                return new HomeLoan();
            }else if(type.equals("business")) {
                return new BusinessLoan();
            }else if(type.equals("education")) {
                return new EducationLoan();
            }
        }
        return null;
    }
}

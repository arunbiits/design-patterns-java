package io.arun.learning.design.core.creational.abstractfactory.example2;

public class BankFactory extends AbstractFactory {
    @Override
    public Bank getBank(String bank) {
        if(bank != null) {
            if(bank.equals("HDFC")) {
                return new HdfcBank();
            }else if(bank.equals("ICICI")) {
                return new IciciBank();
            }else if(bank.equals("SBI")) {
                return new SbiBank();
            }
        }
        return null;
    }

    @Override
    public Loan getLoan(String type) {
        return null;
    }
}

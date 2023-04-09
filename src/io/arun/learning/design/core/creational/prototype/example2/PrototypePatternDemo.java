package io.arun.learning.design.core.creational.prototype.example2;

public class PrototypePatternDemo {
    public static void main(String[] args) {
        Employee emp = new Employee(1, "Arun", "Developer", "Vellore", 10000);
        emp.printDetails();

        Employee empClone = (Employee)emp.clone();
        empClone.printDetails();
    }
}

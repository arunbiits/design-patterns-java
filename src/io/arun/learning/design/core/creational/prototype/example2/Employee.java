package io.arun.learning.design.core.creational.prototype.example2;

public class Employee implements Prototype {
    private int id;
    private String name;
    private String designation;
    private String address;
    private double salary;

    public Employee() {
    }

    public Employee(int id, String name, String designation, String address, double salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.address = address;
        this.salary = salary;
    }

    public void printDetails() {
        System.out.println(id+"\t"+name+"\t"+designation+"\t"+address+"\t"+salary);
    }


    @Override
    public Prototype clone() {
        return new Employee(id, name, designation, address, salary);
    }

}

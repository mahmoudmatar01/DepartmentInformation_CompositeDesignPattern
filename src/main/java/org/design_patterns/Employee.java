package org.design_patterns;

public class Employee implements OrganizationUnit{

    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    @Override
    public double calculateTotalPrice() {
        return salary;
    }
}

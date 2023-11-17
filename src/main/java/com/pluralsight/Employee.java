package com.pluralsight;

public class Employee extends Person{

    private double salary;

    public Employee(String firstName, String lastName, int age, double salary) {
        super(firstName, lastName, age);
        this.salary = 10;
    }

    public double getSalary() {
        return salary+7;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

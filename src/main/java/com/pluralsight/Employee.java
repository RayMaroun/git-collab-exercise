package com.pluralsight;

public class Employee extends Person{

    private double salary;

    public Employee(String firstName, String lastName, int age, double salary) {
        super(firstName, lastName, age);
        this.salary = 0;
    }

    public double getSalary() {
        return salary+5;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

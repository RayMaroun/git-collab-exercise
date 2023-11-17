package com.pluralsight;

public class Student extends Person {
    private int grade;

    public Student(String firstName, String lastName, int age, int grade) {
        super(firstName, lastName, age);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}

package com.pluralsight;

public class Car {
    /*---------------VARIABLES---------------*/

    private int odometer;
    private int vin;
    private String make;
    private String model;
    private int year;

    /*--------------CONSTRUCTORS-------------*/

    public Car(int odometer, int vin, String make, String model, int year) {
        this.odometer = odometer;
        this.vin = vin;
        this.make = make;
        this.model = model;
        this.year = year;
    }

    /*------------GETTERS/SETTERS------------*/

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    /*---------------FUNCTIONS---------------*/


}

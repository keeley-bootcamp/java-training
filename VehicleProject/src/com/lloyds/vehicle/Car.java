package com.lloyds.vehicle;

public class Car extends Vehicle {
    private int numberOfDoors;
    private double bootSize;
    private String bodyStyle;

    public Car (int id, String manufacturer, String model, int year, String colour, double engineSize, String fuelType, String transmission, int numberOfDoors, double bootSize, String bodyStyle) {
        super(id, manufacturer, model, year, colour, engineSize, fuelType, transmission);
        numberOfDoors = this.numberOfDoors;
        bootSize = this.bootSize;
        bodyStyle = this.bodyStyle;
    }

    @Override
    public String createBill() {
        return "Bill for Car: £100";
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public double getBootSize() {
        return bootSize;
    }

    public void setBootSize(double bootSize) {
        this.bootSize = bootSize;
    }

    public String getBodyStyle() {
        return bodyStyle;
    }

    public void setBodyStyle(String bodyStyle) {
        this.bodyStyle = bodyStyle;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfDoors=" + numberOfDoors +
                ", bootSize=" + bootSize +
                ", bodyStyle='" + bodyStyle + '\'' +
                '}';
    }
}

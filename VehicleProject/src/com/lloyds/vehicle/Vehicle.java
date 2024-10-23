package com.lloyds.vehicle;

public class Vehicle {
    private String manufacturer;
    private String model;
    private int year;
    private String colour;
    private double engineSize;
    private String fuelType;
    private String transmission;

    public Vehicle(String manufacturer, String model, int year, String colour, double engineSize, String fuelType, String transmission) {
        manufacturer = this.manufacturer;
        model = this.model;
        year = this.year;
        colour = this.colour;
        engineSize = this.engineSize;
        fuelType = this.fuelType;
        transmission = this.transmission;
    }
    
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
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

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(double engineSize) {
        this.engineSize = engineSize;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

}

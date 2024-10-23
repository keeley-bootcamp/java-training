package com.lloyds.vehicle;

public class Bus extends Vehicle {
    private int passengerCapacity;
    private String storageCapacity;
    private String accessibilityFeatures;

    public Bus(int id, String manufacturer, String model, int year, String colour, double engineSize, String fuelType, String transmission, int passengerCapacity, String storageCapacity, String accessibilityFeatures) {
        super(id, manufacturer, model, year, colour, engineSize, fuelType, transmission);
        passengerCapacity = this.passengerCapacity;
        storageCapacity = this.storageCapacity;
        accessibilityFeatures = this.accessibilityFeatures;
    }

    @Override
    public String createBill() {
        return "Bill for Car: £200";
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public String getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(String storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public String getAccessibilityFeatures() {
        return accessibilityFeatures;
    }

    public void setAccessibilityFeatures(String accessibilityFeatures) {
        this.accessibilityFeatures = accessibilityFeatures;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "passengerCapacity=" + passengerCapacity +
                ", storageCapacity='" + storageCapacity + '\'' +
                ", accessibilityFeatures='" + accessibilityFeatures + '\'' +
                '}';
    }
}

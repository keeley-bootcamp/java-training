package com.lloyds.vehicle;

import java.util.*;

public class Garage {
    private List<Vehicle> vehicles;

    public Garage() {
        this.vehicles = new ArrayList<>();
    }

    public void createBills() {
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.createBill());
        }
    }

    public void addVehicle(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }

    public void removeVehicle(int id) {
        vehicles.removeIf(vehicle -> vehicle.getId() == id);
    }

    public void removeVehiclesByType(Class<?> type) {
        vehicles.removeIf(type::isInstance);
    }

    public void emptyGarage() {
        vehicles.clear();
    }
}

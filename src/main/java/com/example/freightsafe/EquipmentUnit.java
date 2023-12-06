package com.example.freightsafe;

public class EquipmentUnit {
    public int truckNumber;
    public double milesDriven;
    public boolean isAvailable;

    public EquipmentUnit(int truckNumber, double milesDriven,
                         boolean isAvailable
                         ){

        this.truckNumber = truckNumber;
        this.milesDriven = milesDriven;
        this.isAvailable = isAvailable;

    }

    public EquipmentUnit(){
        truckNumber = 0;
        milesDriven = 0;
        isAvailable= true;
    }

    public int getTruckNumber() {
        return truckNumber;
    }

    public void setTruckNumber(int truckNumber) {
        this.truckNumber = truckNumber;
    }

    public double getMilesDriven() {
        return milesDriven;
    }

    public void setMilesDriven(double milesDriven) {
        this.milesDriven = milesDriven;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}

package com.example.freightsafe;

public class EquipmentUnit {
    protected int truckNumber;
    protected double milesDriven;
    protected boolean isAvailable;

    public EquipmentUnit(int truckNumber, double milesDriven,
                         boolean isAvailable
                         ){

        this.truckNumber = truckNumber;
        this.milesDriven = milesDriven;
        this.isAvailable = isAvailable;

    }

}

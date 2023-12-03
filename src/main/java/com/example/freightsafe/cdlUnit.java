package com.example.freightsafe;

public class cdlUnit extends EquipmentUnit{

    protected int truckNumber;
    protected int grossVehicleWeight;
    protected int vehicleLength;
    public cdlUnit(int milesDriven,
                      boolean isAvailable,
                      int grossVehicleWeight,
                      int vehicleLength){

        super(milesDriven, isAvailable);

        if (grossVehicleWeight < 26000 || vehicleLength < 26){
            throw new IllegalArgumentException("Vehicle is non CDL");
        }

        this.grossVehicleWeight = grossVehicleWeight;
        this.vehicleLength = vehicleLength;

    }
}

package com.example.freightsafe;

public class nonCDLUnit extends EquipmentUnit {
    protected int grossVehicleWeight;
    protected int vehicleLength;
    public nonCDLUnit(int milesDriven,
                      boolean isAvailable,
                      int grossVehicleWeight,
                      int vehicleLength){

        super(milesDriven, isAvailable);

        if (grossVehicleWeight > 26000 || vehicleLength > 26){
            throw new IllegalArgumentException("Vehicle requires CDL");
        }

        this.grossVehicleWeight = grossVehicleWeight;
        this.vehicleLength = vehicleLength;

    }
}

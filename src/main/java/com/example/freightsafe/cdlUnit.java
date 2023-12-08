package com.example.freightsafe;

public class cdlUnit extends EquipmentUnit{

    protected Double grossVehicleWeight;
    protected Double vehicleLength;
    public cdlUnit(Double truckNum, Double milesDriven,
                      String isAvailable,
                      Double grossVehicleWeight,
                      Double vehicleLength){

        super(truckNum, milesDriven, isAvailable);

        if (grossVehicleWeight < 26000 || vehicleLength < 26){
            throw new IllegalArgumentException("Vehicle is non CDL");
        }

        this.grossVehicleWeight = grossVehicleWeight;
        this.vehicleLength = vehicleLength;

    }
}

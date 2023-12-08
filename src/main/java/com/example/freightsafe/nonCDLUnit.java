package com.example.freightsafe;

import javafx.beans.property.SimpleBooleanProperty;

public class nonCDLUnit extends EquipmentUnit {

    protected Double grossVehicleWeight;
    protected Double vehicleLength;
    public nonCDLUnit(Double truckNum, Double milesDriven,
                      String isAvailable,
                      Double grossVehicleWeight,
                      Double vehicleLength){

        super(truckNum, milesDriven, isAvailable);

        if (grossVehicleWeight >= 26000 || vehicleLength > 26){
            throw new IllegalArgumentException("Vehicle requires CDL");
        }

        this.grossVehicleWeight = grossVehicleWeight;
        this.vehicleLength = vehicleLength;

    }


}

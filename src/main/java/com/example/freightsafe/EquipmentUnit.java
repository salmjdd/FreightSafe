package com.example.freightsafe;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;

public class EquipmentUnit {
    public Double truckNumber;
    public Double milesDriven;
    public String isAvailable;

    private SimpleBooleanProperty bolAve;

    public EquipmentUnit(Double truckNumber, Double milesDriven,
                         String isAvailable
                         ){

        this.truckNumber = truckNumber;
        this.milesDriven = milesDriven;
        this.isAvailable = isAvailable;
        //this.bolAve = bolAve;

    }

    public EquipmentUnit(){
        truckNumber = (double) 0;
        milesDriven = (double) 0;
        isAvailable= "yes";
    }

    public Double getTruckNumber() {
        return truckNumber;
    }

    public void setTruckNumber(int truckNumber) {
        this.truckNumber = (double) truckNumber;
    }

    public double getMilesDriven() {
        return milesDriven;
    }

    public void setMilesDriven(double milesDriven) {
        this.milesDriven = milesDriven;
    }

    public String isAvailable() {
        return isAvailable;
    }

    public void setAvailable(String available) {
        isAvailable = available;
    }

    public BooleanProperty bolActiveProperty(){
        return bolAve;
    }

    public final Boolean getBolActive() {
        return bolAve.get();
    }

    public final void setBolActive(Boolean bolActive) {
        this.bolAve.set(bolActive);
    }
}

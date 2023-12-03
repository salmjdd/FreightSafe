package com.example.freightsafe;

public class OTRDriver extends Driver implements DriverQualifications{
    private double payRate;
    private double startOdometer;
    private double endOdometer;
    //paid per mile

    public OTRDriver() {
        payRate = 0.0;
        startOdometer = 0.0;
        endOdometer = 0.0;
    }

    public OTRDriver(double rate, double start, double end) {
        payRate = rate;
        startOdometer = start;
        endOdometer = end;
    }

    private double miles(){ return endOdometer - startOdometer;}

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getStartOdometer() {
        return startOdometer;
    }

    public void setStartOdometer(double startOdometer) {
        this.startOdometer = startOdometer;
    }

    public double getEndOdometer() {
        return endOdometer;
    }

    public void setEndOdometer(double endOdometer) {
        this.endOdometer = endOdometer;
    }

    /**
     * This method checks to make sure the driver has not passed
     * 8.5 hours of driving.
     * @return false if the driver has been driving more than 8,5 hours
     * without taking a break;
     */
    @Override
    public boolean checkHours() {
        //check hours
        if((getHoursDriven() >= 8.5) && !getHasTakenBreak())
            return false;
        return true;
    }



    @Override
    public boolean checkCredentials() {
        return false;
    }

    @Override
    public boolean checkAge() {
        if(isUnder21()){
            return false;
        }
        return true;
    }

    //since we're not storing a collection of drivers, maybe this
    //method should be used in the controller classes.

//    @Override
//    public void addDriver(Driver d) {
//
//    }
//
//    @Override
//    public Driver removeDriver() {
//        return null;
//    }
}
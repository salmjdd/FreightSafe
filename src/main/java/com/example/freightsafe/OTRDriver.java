package com.example.freightsafe;

public class OTRDriver {
    private double payRate;
    private double startOdometer;
    private double endOdometer;

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
}

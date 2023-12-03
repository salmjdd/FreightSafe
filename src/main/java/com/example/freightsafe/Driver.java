package com.example.freightsafe;

public class Driver {
    private String name;
    private int licenseNum;
    private int phoneNum;
    private boolean hasCDL;
    private char CDLClass;
    private boolean under21;
    private double hoursDriven;
    private boolean isAvailable;
    private boolean hasTakenBreak;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLicenseNum() {
        return licenseNum;
    }

    public void setLicenseNum(int licenseNum) {
        this.licenseNum = licenseNum;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public boolean isHasCDL() {
        return hasCDL;
    }

    public void setHasCDL(boolean hasCDL) {
        this.hasCDL = hasCDL;
    }

    public char getCDLClass() {
        return CDLClass;
    }

    public void setCDLClass(char CDLClass) {
        this.CDLClass = CDLClass;
    }

    public boolean isUnder21() {
        return under21;
    }

    public void setUnder21(boolean under21) {
        this.under21 = under21;
    }

    public double getHoursDriven() {
        return hoursDriven;
    }

    public void setHoursDriven(double hoursDriven) {
        this.hoursDriven = hoursDriven;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public boolean getHasTakenBreak(){return hasTakenBreak;}

    public void setHasTakenBreak(boolean bbreak){
        hasTakenBreak = bbreak;
    }
    public void setAvailable(boolean available) {
        isAvailable = available;
    }
////////////////////////////// IMPLEMENT

}

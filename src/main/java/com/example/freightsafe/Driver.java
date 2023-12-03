package com.example.freightsafe;

public class Driver {
    private String name;
    private int licenseNum;
    private int phoneNum;
    private boolean hasCDL;
    private char cdlClass;
    private boolean under21;
    private double hoursDriven;
    private boolean isAvailable;
    private boolean hasTakenBreak;


    public Driver() {
        name = "";
        licenseNum = 0;
        phoneNum = 0;
        hasCDL = false;
        cdlClass = 'z';
        under21 = false;
        hoursDriven = 0;
        isAvailable = true;
        hasTakenBreak = false;

    }

    public Driver(String name, int licenseNum, int phoneNum, boolean hasCDL, char cDLClass, boolean under21, double hoursDriven, boolean isAvailable, boolean hasTakenBreak) {
        this.name = name;
        this.licenseNum = licenseNum;
        this.phoneNum = phoneNum;
        this.hasCDL = hasCDL;
        this.cdlClass = cDLClass;
        this.under21 = under21;
        this.hoursDriven = hoursDriven;
        this.isAvailable = isAvailable;
        this.hasTakenBreak = hasTakenBreak;
    }



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
        return cdlClass;
    }

    public void setCDLClass(char cdlClass) {
        this.cdlClass = cdlClass;
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

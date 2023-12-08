package com.example.freightsafe;

public class Driver {
    private String name;
    private long licenseNum;
    private long phoneNum;
    private String hasCDL;
    private String cdlClass;
    private String under21;
    private double hoursDriven;
    private String isAvailable;
    private String hasTakenBreak;


    public Driver() {
        name = "";
        licenseNum = 0;
        phoneNum = 0;
        hasCDL = "yes";
        cdlClass = "A";
        under21 = "no";
        hoursDriven = 0;
        isAvailable = "yes";
        hasTakenBreak = "yes";

    }

    public Driver(String name, long licenseNum, long phoneNum, String hasCDL, String cDLClass, String under21, double hoursDriven, String isAvailable, String hasTakenBreak) {
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

    public long getLicenseNum() {
        return licenseNum;
    }

    public void setLicenseNum(long licenseNum) {
        this.licenseNum = licenseNum;
    }

    public long getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(long phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String isHasCDL() {
        return hasCDL;
    }

    public void setHasCDL(String hasCDL) {
        this.hasCDL = hasCDL;
    }

    public String getCDLClass() {
        return cdlClass;
    }

    public void setCDLClass(String cdlClass) {
        this.cdlClass = cdlClass;
    }

    public String isUnder21() {
        return under21;
    }

    public void setUnder21(String under21) {
        this.under21 = under21;
    }

    public double getHoursDriven() {
        return hoursDriven;
    }

    public void setHoursDriven(double hoursDriven) {
        this.hoursDriven = hoursDriven;
    }

    public String isAvailable() {
        return isAvailable;
    }

    public String getHasTakenBreak(){return hasTakenBreak;}

    public void setHasTakenBreak(String bbreak){
        hasTakenBreak = bbreak;
    }
    public void setAvailable(String available) {
        isAvailable = available;
    }
////////////////////////////// IMPLEMENT

}

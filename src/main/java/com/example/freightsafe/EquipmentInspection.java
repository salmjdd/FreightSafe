package com.example.freightsafe;

import java.util.ArrayList;
import java.util.Scanner;

public class EquipmentInspection {
    private boolean serviceBrakes;
    private boolean parkingBrake;
    private boolean steering;
    private boolean lightsReflectors;
    private boolean tires;
    private boolean horn;
    private boolean windshieldWipers;
    private boolean rearMirrors;
    private boolean couplingDevices;
    private boolean wheelsRims;
    private boolean emergencyEquipment;

    ArrayList<Boolean> checkList = new ArrayList<Boolean>();
    ArrayList<Boolean> attentionRequired = new ArrayList<Boolean>();

    public EquipmentInspection(boolean serviceBrakes,
                               boolean parkingBrake,
                               boolean steering,
                               boolean lightsReflectors,
                               boolean tires,
                               boolean horn,
                               boolean windshieldWipers,
                               boolean rearMirrors,
                               boolean couplingDevices,
                               boolean wheelsRims,
                               boolean emergencyEquipment
                               ){

        this.setServiceBrakes(serviceBrakes);
        this.setParkingBrake(parkingBrake);
        this.setSteering(steering);
        this.setLightsReflectors(lightsReflectors);
        this.setTires(tires);
        this.setHorn(horn);
        this.setWindshieldWipers(windshieldWipers);
        this.setRearMirrors(rearMirrors);
        this.setCouplingDevices(couplingDevices);
        this.setWheelsRims(wheelsRims);
        this.setEmergencyEquipment(emergencyEquipment);

    }

    //default constructor
    public EquipmentInspection(){

        this.setServiceBrakes(true);
        this.setParkingBrake(true);
        this.setSteering(true);
        this.setLightsReflectors(true);
        this.setTires(true);
        this.setHorn(true);
        this.setWindshieldWipers(true);
        this.setRearMirrors(true);
        this.setCouplingDevices(true);
        this.setWheelsRims(true);
        this.setEmergencyEquipment(true);

    }



    public boolean checkInspectionReport(){
        for (int i = 0; i < checkList.size(); i++) {
            if (checkList.get(i) == false)
            {
                attentionRequired.set(i, checkList.get(i));
            }
        }
        if (checkList.size() > 0)
        {
            return false;
        } else {
            return true;
        }
    }

    public boolean isServiceBrakes() {
        return serviceBrakes;
    }

    public void setServiceBrakes(boolean serviceBrakes) {
        this.serviceBrakes = serviceBrakes;
    }

    public boolean isParkingBrake() {
        return parkingBrake;
    }

    public void setParkingBrake(boolean parkingBrake) {
        this.parkingBrake = parkingBrake;
    }

    public boolean isSteering() {
        return steering;
    }

    public void setSteering(boolean steering) {
        this.steering = steering;
    }

    public boolean isLightsReflectors() {
        return lightsReflectors;
    }

    public void setLightsReflectors(boolean lightsReflectors) {
        this.lightsReflectors = lightsReflectors;
    }

    public boolean isTires() {
        return tires;
    }

    public void setTires(boolean tires) {
        this.tires = tires;
    }

    public boolean isHorn() {
        return horn;
    }

    public void setHorn(boolean horn) {
        this.horn = horn;
    }

    public boolean isWindshieldWipers() {
        return windshieldWipers;
    }

    public void setWindshieldWipers(boolean windshieldWipers) {
        this.windshieldWipers = windshieldWipers;
    }

    public boolean isRearMirrors() {
        return rearMirrors;
    }

    public void setRearMirrors(boolean rearMirrors) {
        this.rearMirrors = rearMirrors;
    }

    public boolean isCouplingDevices() {
        return couplingDevices;
    }

    public void setCouplingDevices(boolean couplingDevices) {
        this.couplingDevices = couplingDevices;
    }

    public boolean isWheelsRims() {
        return wheelsRims;
    }

    public void setWheelsRims(boolean wheelsRims) {
        this.wheelsRims = wheelsRims;
    }

    public boolean isEmergencyEquipment() {
        return emergencyEquipment;
    }

    public void setEmergencyEquipment(boolean emergencyEquipment) {
        this.emergencyEquipment = emergencyEquipment;
    }


    public void promptUserInput(){
        Scanner scnr = new Scanner(System.in);

        System.out.println("Welcome to FreightSafe. Input y to pass inspection point, input n if attention req'd.");
        System.out.println("input service brakes status: ");
        if (scnr.nextLine().equals("y")) {
            setServiceBrakes(true);

        } else {
            setServiceBrakes(false);
        }
        System.out.println("input parking brakes status: ");
        if (scnr.nextLine().equals("y")) {
            setParkingBrake(true);
        } else {
            setParkingBrake(false);
        }
        System.out.println("input steering status: ");
        if (scnr.nextLine().equals("y")) {
            setSteering(true);
        } else {
            setSteering(false);
        }
        System.out.println("input refletor light status: ");
        if (scnr.nextLine().equals("y")) {
            setLightsReflectors(true);
        } else {
            setLightsReflectors(false);
        }
        System.out.println("input tires status: ");
        if (scnr.nextLine().equals("y")) {
            setTires(true);
        } else {
            setTires(false);
        }
        System.out.println("input horn status: ");
        if (scnr.nextLine().equals("y")) {
            setHorn(true);
        } else {
            setHorn(false);
        }
        System.out.println("input windshield wiper brakes status: ");
        if (scnr.nextLine().equals("y")) {
            setWindshieldWipers(true);
        } else {
            setWindshieldWipers(false);
        }
        System.out.println("input rear mirror status: ");
        if (scnr.nextLine().equals("y")) {
            setRearMirrors(true);
        } else {
            setRearMirrors(false);
        }
        System.out.println("input coupling device status: ");
        if (scnr.nextLine().equals("y")) {
            setCouplingDevices(true);
        } else {
            setCouplingDevices(false);
        }
        System.out.println("input wheel rim status: ");
        if (scnr.nextLine().equals("y")) {
            setWheelsRims(true);
        } else {
            setWheelsRims(false);
        }
        System.out.println("input emergency equipment status: ");
        if (scnr.nextLine().equals("y")) {
            setEmergencyEquipment(true);
        } else {
            setEmergencyEquipment(false);
        }

    }
}

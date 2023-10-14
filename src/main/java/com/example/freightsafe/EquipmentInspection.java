package com.example.freightsafe;

public class EquipmentInspection {
    protected boolean serviceBrakes;
    protected boolean parkingBrake;
    protected boolean steering;
    protected boolean lightsReflectors;
    protected boolean tires;
    protected boolean horn;
    protected boolean windshieldWipers;
    protected boolean rearMirrors;
    protected boolean couplingDevices;
    protected boolean wheelsRims;
    protected boolean emergencyEquipment;

    protected boolean[] checkList = new boolean[11];
    protected boolean[] attentionRequired = new boolean[11];

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

        this.serviceBrakes = serviceBrakes;
        this.parkingBrake = parkingBrake;
        this.steering = steering;
        this.lightsReflectors = lightsReflectors;
        this.tires = tires;
        this.horn = horn;
        this.windshieldWipers = windshieldWipers;
        this.rearMirrors = rearMirrors;
        this.couplingDevices = couplingDevices;
        this.wheelsRims = wheelsRims;
        this.emergencyEquipment = emergencyEquipment;

    }

    public boolean checkInspectionReport(){
        for (int i = 0; i < checkList.length; i++) {
            if (checkList[i] == false)
            {
                attentionRequired[i] = checkList[i];
            }
        }
        if (attentionRequired.length > 0)
        {
            return false;
        } else {
            return true;
        }
    }
}

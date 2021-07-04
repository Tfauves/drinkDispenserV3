package com.company;
import java.util.*;

//
//Shots Details
//        the shots class will have:
//        a flavor name
//        current amount of liquid
//        amount to dispense per "shot"
//        a dispense() method that deducts the liquid for a single shot per call and returns the flavor of the shot.
//        a getVolume method that will return the amount of shots remaining (not liquid amount the number of shots);
//        Extra Challenges:
//        make the fields all private.
//        update the dispense method to see if there is enough liquid to dispense and if not return null instead of the flavor.


public class Shots {
    public String flavorName;
    public int curntVol;
    public int dispAmt;

    public Shots(String flavorName, int curntVol, int dispAmt) {
        this.flavorName = flavorName;
        this. curntVol = curntVol;
        this.dispAmt =  dispAmt;
    }

    public String dispenseShot() {
        curntVol --;
        return flavorName;
    }

    public int getVol() {
        int remainVol = curntVol - dispAmt;
        return remainVol;
    }
}

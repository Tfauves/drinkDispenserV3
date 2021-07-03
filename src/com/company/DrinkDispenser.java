package com.company;

import java.util.ArrayList;
import java.util.List;

public class DrinkDispenser {
    public List<Syrup> syrups = new ArrayList<>();

    public CupHolder small;
    public CupHolder medium;
    public CupHolder large;

    public DrinkDispenser(int smallVol, int mediumVol, int largeVol) {

        small = new CupHolder(smallVol);
        medium = new CupHolder(mediumVol);
        large = new CupHolder(largeVol);
    }

    public void serveDrink(String size, int syrupI) {
        int vol;

        switch (size) {
            case "S" :
                vol = small.dispenseCup();
                break;
            case "M" :
                vol = medium.dispenseCup();
                break;
            case "L" :
                vol = large.dispenseCup();
                break;
            default:
                System.out.println("ERROR: invalid size");
                return;
        }
        String drink = syrups.get(syrupI).dispense(vol);

        System.out.printf("%s %s\n", size, drink);
        //System.out.println(size + " " + drink);

    }

    public void addSyrup(Syrup newSyrup) {
        syrups.add(newSyrup);
    }

    public void addSyrup(String name, int vol) {
        syrups.add(new Syrup(name, vol));
    }

    public List<String> lowSyrups(int lowValue) {
        List<String> areLow = new ArrayList<>();

        for (int i = 0; i < syrups.size(); i++) {
            if (syrups.get(i).getVol() <= lowValue) {
                areLow.add(i + ": " + syrups.get(i).name);
            }
        }

        return areLow;
    }


}

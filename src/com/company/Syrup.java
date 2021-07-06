package com.company;

public class Syrup {
    private String name;
    private int vol;

    public String getName() {
        return name;}
        public void setName(String syrupName) {
            this.name = syrupName;
        }


    public Syrup(String name, int vol) {
        this.name = name;
        this.vol = vol;
    }

    public String dispense(int amt) {
        vol -= amt;
        return name;
    }

    public int getVol() {
        return vol;
    }

}

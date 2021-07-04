package com.company;

public class CupHolder {
    private int vol;
    private int qty = 0;

    public int getQty() {
        return qty;
    }
    public void setQty(int dispQty) {
        this.qty = dispQty;
    }

    public CupHolder(int vol) {
        this.vol = vol;
    }

    public int dispenseCup() {
        //decrement qty
        qty--;

        //return vol
        return vol;
    }

    public void refill(int amt) {

        qty += amt;
    }


}

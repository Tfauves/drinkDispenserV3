package com.company;

public class Main {

    public static void main(String[] args) {


        DrinkDispenser dispenser01 = new DrinkDispenser(5, 8, 12);

        dispenser01.small.refill(20);
        dispenser01.medium.refill(15);
        dispenser01.large.refill(12);

        dispenser01.addSyrup("Coke", 2000);
        dispenser01.addSyrup("Dr.Pepper", 1000);
        dispenser01.addSyrup("Sprite", 700);
        dispenser01.addSyrup("Root Beer", 700);



        System.out.printf("M cups: %d\tdrink 1 vol: %d\n", dispenser01.medium.getQty(), dispenser01.syrups.get(1).getVol());
        dispenser01.serveDrink("S", 1);

        dispenser01.serveDrink("M", 2);
        dispenser01.serveDrink("M", 2);
        dispenser01.serveDrink("L", 3);
        System.out.printf("M cups: %d\tdrink 1 vol: %d\n", dispenser01.medium.getQty(), dispenser01.syrups.get(1).getVol());
        System.out.println(dispenser01.lowSyrups(50));

    }
}

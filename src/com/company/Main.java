package com.company;

public class Main {

    public static void main(String[] args) {


        DrinkDispenser dispenser01 = new DrinkDispenser(5, 8, 12);
        dispenser01.addSyrup(new Syrup("Coke", 2000));
        dispenser01.addSyrup(new Syrup("Dr.Pepper", 1000));
        dispenser01.addSyrup(new Syrup("Sprite", 700));
        dispenser01.addSyrup(new Syrup("Root Beer", 700));

    }
}

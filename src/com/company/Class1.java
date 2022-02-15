package com.company;

public class Class1 extends Vehicle {






    public Class1(String name, String model, int nomer, int god) {
        super(name, model, nomer, god);


    }
    public void veh(){
        System.out.println("tex tex");
    }

    @Override
    public void move() {
        System.out.println("Vehicle move");
    }

    @Override
    public void vex() {
        super.vex();
    }
}

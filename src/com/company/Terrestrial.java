package com.company;

public abstract class Terrestrial extends Vehicle {

    public Terrestrial(String name, String model, int nomer, int god) {
        super(name, model, nomer, god);
    }

    @Override
    public void move() {

    }

    public abstract void  jertex();

    public abstract void jertank();

    @Override
    public void vex() {
        super.vex();
    }
}

package com.company;

public abstract class Air extends Vehicle{

    public Air(String name, String model, int nomer, int god) {
        super(name, model, nomer, god);
    }

    @Override
    public void move() {

    }

    public abstract void uchat();

    public abstract void kattuuchat();

    @Override
    public void vex() {
        super.vex();
    }
}


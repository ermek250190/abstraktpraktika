package com.company;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public abstract class Aqueous extends Vehicle{

    public Aqueous(String name, String model, int nomer, int god) {
        super(name, model, nomer, god);
    }

    @Override
    public void move() {

    }

    public abstract void  suudajurod();

    public abstract void suuastundajurot();

    @Override
    public void vex() {
        super.vex();
    }
}

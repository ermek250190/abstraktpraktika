package com.company;

public class Class3 extends Terrestrial {



    public Class3(String name, String model, int nomer, int god) {
        super(name, model, nomer, god);
    }

    public void terrestial2(){
        System.out.println("jer texnika  ");
    }

    @Override
    public void jertex() {
        System.out.println("jerde jurot");
    }

    @Override
    public void jertank() {
        System.out.println("jerde kiymal ");
    }

    @Override
    public void vex() {
        super.vex();
    }
}

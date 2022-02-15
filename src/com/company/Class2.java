package com.company;

public class Class2 extends Air{



    public Class2(String name, String model, int nomer, int god) {
        super(name, model, nomer, god);
    }

 public void air2(){
     System.out.println("biyik ucha alat");
 }

    @Override
    public void uchat() {
        System.out.println("tez uchat");
    }

    @Override
    public void kattuuchat() {
        System.out.println("katuu uchat");
    }

    @Override
    public void vex() {
        super.vex();
    }
}

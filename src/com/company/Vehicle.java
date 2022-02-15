package com.company;

public abstract class Vehicle {
   private String name;
   private String model;
   private int nomer;
   private int god;

    public Vehicle(String name, String model, int nomer, int god) {
        this.name = name;
        this.model = model;
        this.nomer = nomer;
        this.god = god;
    }
     public abstract void  move();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNomer() {
        return nomer;
    }

    public void setNomer(int nomer) {
        this.nomer = nomer;
    }

    public int getGod() {
        return god;
    }

    public void setGod(int god) {
        this.god = god;
    }

      public void vex(){
          System.out.println("  "+getName()+"  "+getModel()+"  "+getGod()+"  "+getNomer());

}
}
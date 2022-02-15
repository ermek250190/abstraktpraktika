package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Class1 class1 = new Class1(" tex tt55  ", " sx588   ", 777, 20220101);
         class1.vex();

        Class2 class2 = new Class2("boing 777tt   ", "rr777zz  ", 777, 20220202);
         class2.vex();

        Class3 class3 = new Class3("tank dtx   ", "stx40   ", 777, 20220303);
         class3.vex();

        Class4 class4 = new Class4("pdcodvyi   ", "df999   ", 777, 20220404);
         class4.vex();

        Vehicle[] vehicles = {class1, class2, class3, class4};

        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Class1) {
                vehicle.move();
                ((Class1) vehicle).veh();
            } else if (vehicle instanceof Class2) {
                ((Class2) vehicle).air2();
                ((Class2) vehicle).uchat();
                ((Class2) vehicle).kattuuchat();
                }else if(vehicle instanceof Class3){
                ((Class3) vehicle).terrestial2();
                ((Class3) vehicle).jertank();
                ((Class3) vehicle).jertex();
            }else if(vehicle instanceof Class4){
                ((Class4) vehicle).aque2();
                ((Class4) vehicle).suuastundajurot();
                ((Class4) vehicle).suudajurod();

            }
        }


        }


    }

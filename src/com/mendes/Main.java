package com.mendes;

public class Main {

    public static void main(String[] args) {


        Cat tiger = new Tiger("Kasap", 3);
        Cat houseCat = new HouseCat("Tekir", 2);
        Cat cheetah = new Cheetah("Melo", 5);

        houseCat.jump();
        houseCat.claw();
        houseCat.doHunt();
        System.out.println();

        cheetah.jump();
        cheetah.claw();
        cheetah.doHunt();
        System.out.println();

        tiger.jump();
        tiger.claw();
        tiger.doHunt();
    }
}

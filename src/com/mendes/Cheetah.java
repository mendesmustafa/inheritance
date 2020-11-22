package com.mendes;

/**
 * Created by mendesmustafa on 29.10.2020.
 */

public class Cheetah extends Cat {

    public Cheetah(String name, int age) {
        super(name, age);
    }

    @Override
    public void claw() {
        super.claw();
        System.out.println("pençe atma siddeti:90");
    }

    @Override
    public void jump() {
        super.jump();
        System.out.println("ziplama mesafesi 6 metre");
    }

    @Override
    public void doHunt() {
        super.doHunt();
        System.out.println("av turu " + HuntType.KOYUN);
    }

    @Override
    public String toString() {
        return "Cheetah [toString()=" + super.toString() + "]";
    }

}

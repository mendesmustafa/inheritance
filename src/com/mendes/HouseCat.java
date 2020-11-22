package com.mendes;

/**
 * Created by mendesmustafa on 29.10.2020.
 */

public class HouseCat extends Cat {

    public HouseCat(String name, int age) {
        super(name, age);
    }

    @Override
    public void claw() {
        super.claw();
        System.out.println("tirmalama siddeti:20");
    }

    @Override
    public void jump() {
        super.jump();
        System.out.println("ziplama mesafesi 1 metre");
    }

    @Override
    public void doHunt() {
        super.doHunt();
        System.out.println("av turu " + HuntType.FARE);
    }

    @Override
    public String toString() {
        return "HouseCat [toString()=" + super.toString() + "]";
    }
}

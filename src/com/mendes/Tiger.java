package com.mendes;

/**
 * Created by mendesmustafa on 29.10.2020.
 */

public class Tiger extends Cat {

    public Tiger(String name, int age) {
        super(name, age);
    }

    @Override
    public void claw() {
        super.claw();
        System.out.println("pence atma siddeti:100");
    }

    @Override
    public void jump() {
        super.jump();
        System.out.println("ziplama mesafesi 5 metre");
    }

    @Override
    public void doHunt() {
        super.doHunt();
        System.out.println("av turu " + HuntType.GEYİK);
    }

    @Override
    public String toString() {
        return "Tiger [toString()=" + super.toString() + "]";
    }
}

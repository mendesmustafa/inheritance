package com.mendes;

/**
 * Created by mendesmustafa on 29.10.2020.
 */

public class Cat {

    public String name;
    public int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void claw() {
        System.out.println(showInfo() + "Kedi tirmaladi..");
    }

    public void jump() {
        System.out.println(showInfo() + "Kedi zipladi..");
    }

    public void doHunt() {
        System.out.println(showInfo() + "Kedi av yapti..");
    }

    private String showInfo() {
        return "turu " + getClass().getSimpleName() + " adi:" + name + " yasi:" + age + " olan ";
    }

    @Override
    public String toString() {
        return "Cat [isim=" + name + ", yas=" + age + "]";
    }
}

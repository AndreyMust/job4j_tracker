package ru.job4j.tracker.poly;

public class Buss implements Vehicle {

    @Override
    public void move() {
        System.out.println("'" + getClass().getSimpleName() + "'"
                + " moves by highways");
    }

    @Override
    public void boarding() {
        System.out.println("Boarding to the " + getClass().getSimpleName()
                + " goes at the bus stop");
    }
}

package ru.job4j.tracker.poly;

public class Train implements Vehicle {

    @Override
    public void move() {
        System.out.println("'" + getClass().getSimpleName() + "'"
                + " moves by railways");
    }

    @Override
    public void boarding() {
        System.out.println("Boarding to the " + getClass().getSimpleName()
                + " goes at the station");
    }
}

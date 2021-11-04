package ru.job4j.tracker.poly;

public class Airplane implements Vehicle {

    private String name;

    @Override
    public void move() {
        System.out.println("'" + getClass().getSimpleName() + "'" + " moves by air");
    }

    @Override
    public void boarding() {
        System.out.println("Welcome on Board to the " + getClass().getSimpleName()
                + ". Thanks for choosing our airline ");
    }
}

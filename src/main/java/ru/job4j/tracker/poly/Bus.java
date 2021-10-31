package ru.job4j.tracker.poly;

public class Bus implements Transport {
    private int passengerCount;

    @Override
    public void drive() {
        System.out.println("The " + getClass().getSimpleName()
                + " is on the line");
    }

    @Override
    public void passengers(int passengersCount) {
        System.out.println("On board " + passengerCount + " people");
    }

    @Override
    public int tankUp(int volume) {
        return 56 * volume;
    }
}

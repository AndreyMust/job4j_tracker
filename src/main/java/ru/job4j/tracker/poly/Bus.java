package ru.job4j.tracker.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
    }

    @Override
    public void passengers(int passengersCount) {
    }

    @Override
    public int tankUp(int volume) {
        int price = 56;
        return price;
    }
}

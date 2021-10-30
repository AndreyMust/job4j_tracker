package ru.job4j.tracker.poly;

public interface Transport {
    void drive();
    void passengers(int passengersCount);
    int tankUp(int volume);
}

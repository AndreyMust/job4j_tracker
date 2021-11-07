package ru.job4j.tracker;

public class SingleTracker {
    private static Tracker tracker;

    private SingleTracker() {
    }

    public static Tracker getTracker() {
        if (tracker == null) {
            tracker = new Tracker();
        }
        return tracker;
    }
}

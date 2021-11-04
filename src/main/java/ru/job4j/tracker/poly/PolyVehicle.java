package ru.job4j.tracker.poly;

public class PolyVehicle {
    public static void main(String[] args) {
        Vehicle jetPlane = new Airplane();
        Vehicle jet = new Airplane();
        Vehicle train = new Train();
        Vehicle shuttleBus = new Buss();
        Vehicle[] vehicles = new Vehicle[] {jetPlane, jet, train, shuttleBus};
        for (Vehicle vehicle : vehicles) {
            vehicle.boarding();
            vehicle.move();
        }
    }
}

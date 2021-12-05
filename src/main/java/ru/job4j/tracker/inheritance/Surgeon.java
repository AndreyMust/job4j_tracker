package ru.job4j.tracker.inheritance;

import java.util.Date;

public class Surgeon extends Doctor {

    public Surgeon(String name, String surname, String education,
                   Date birthday, String clinicName) {
        super(name, surname, education, birthday, clinicName);
    }

    public boolean doSurgery(String patientName) {
        return false;
    }
}

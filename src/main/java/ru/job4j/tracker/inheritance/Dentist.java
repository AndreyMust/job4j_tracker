package ru.job4j.tracker.inheritance;

import java.util.Date;

public class Dentist extends Doctor {

    public Dentist(String name, String surname, String education,
                   Date birthday, String clinicName) {
        super(name, surname, education, birthday, clinicName);
    }

    public boolean treatTeeth() {
        return false;
    }
}

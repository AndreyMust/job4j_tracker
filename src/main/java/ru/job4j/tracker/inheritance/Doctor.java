package ru.job4j.tracker.inheritance;

import java.util.Date;

public class Doctor extends Profession {

    private String clinicName;

    public Doctor(String name, String surname, String education, Date birthday, String clinicName) {
        super(name, surname, education, birthday);
        this.clinicName = clinicName;
    }

    public String getClinicName() {
        return clinicName;
    }

    public void setClinicName(String clinicName) {
        this.clinicName = clinicName;
    }
}

package ru.job4j.tracker.inheritance;

import java.util.Date;

public class Builder extends Engineer {

    private String typeHouse;

    public Builder(String name, String surname, String education, Date birthday, String typeHouse) {
        super(name, surname, education, birthday);
        this.typeHouse = typeHouse;
    }

    public String getTypeHouse() {
        return typeHouse;
    }

    public static boolean buildHouse() {
        return false;
    }
}

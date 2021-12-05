package ru.job4j.tracker.inheritance;

import java.util.Date;

public class Programmer extends Engineer {

    private String programName;

    public Programmer(String name, String surname, String education,
                      Date birthday, String programName) {
        super(name, surname, education, birthday);
        this.programName = programName;
    }

    public String getProgramName() {
        return programName;
    }

    public static boolean makeProgram() {
        return false;
    }
}

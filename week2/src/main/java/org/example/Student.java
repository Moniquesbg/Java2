package org.example;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Student {
    //fields
    private String name;
    private int studentNumber;
    private int year;
    private int month;
    private int day;

    //constructor
    public Student(String name, int studentNumber, int year, int month, int day) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.year = year;
        this.month = month;
        this.day = day;
    }

    //getters and setters
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public int getStudentNumber() {
        return this.studentNumber;
    }

    public LocalDate getDateOfBirth() {
        LocalDate birthday = LocalDate.of(this.year, this.month, this.day);
        return birthday;
    }

    public void setDateOfBirth(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    //methods

    /**
     * Creates an Url-Friendly Name
     * @return URL friendly name
     */
    public String createUrlFriendlyName()
    {
        String createURL = getName() + " " + getDateOfBirth().toString();
        return Constant.createUrl(createURL);
    }


}
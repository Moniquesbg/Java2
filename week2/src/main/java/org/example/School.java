package org.example;

import java.util.HashSet;
import java.util.HashMap;

public class School {

    //fields
    private String name;
    private HashSet<Student> students;

    //constructor
    public School(String name) {
        this.name = name;
        this.students = new HashSet();
    }

    //getters and setters
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public HashSet<Student> getStudents() {
        return this.students;
    }

    public void addStudents(Student student) {
        this.students.add(student);
    }

    //methods

    /**
     * Creates an URL friendly name
     * @return url friendly name
     */
    public String createFriendlyName()
    {
        return Constant.createUrl(getName());
    }
}

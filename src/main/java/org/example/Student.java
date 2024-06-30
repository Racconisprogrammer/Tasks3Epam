package org.example;

import java.util.Date;

public class Student {

    private int id;

    private String surName;

    private String name;

    private String fatherName;

    private Date dateOfBirth;

    private String address;

    private int number;

    private String facultet;

    private int course;

    private String group;

    public Student(int id, String surName, String name, String fatherName, Date dateOfBirth, String address, int number, String facultet, int course, String group) {
        this.id = id;
        this.surName = surName;
        this.name = name;
        this.fatherName = fatherName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.number = number;
        this.facultet = facultet;
        this.course = course;
        this.group = group;
    }

    boolean studentsFacultet(String facultet) {
        if (this.facultet.equals(facultet)) {
            System.out.println(this.surName + " " + this.name + " " + this.facultet);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", surName='" + surName + '\'' +
                ", name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", address='" + address + '\'' +
                ", number=" + number +
                ", facultet='" + facultet + '\'' +
                ", course=" + course +
                ", group='" + group + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getFacultet() {
        return facultet;
    }

    public void setFacultet(String facultet) {
        this.facultet = facultet;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}

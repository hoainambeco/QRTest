package com.example.qrcode.Model;

public class Person {
    private String ID;
    private String FullName;
    private int age;

    public Person() {
    }

    public Person(String ID, String fullName, int age) {
        this.ID = ID;
        FullName = fullName;
        this.age = age;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


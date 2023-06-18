package com.example.madrasaapplication;

public class Students {
    private String name;

    private String age;
    private String section;
    private String rollNo;

    public Students(String name, String age, String section, String rollNo) {
        this.name = name;
        this.age = age;
        this.section = section;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }
}

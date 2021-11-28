package com.bjpn.ba02;

public class Student {
    private String name;
    private Integer age;
    private School school;

    public void setName(String name) {
        this.name = name;
        System.out.println("Student");
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
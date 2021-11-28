package com.bjpn.ba05;

public class Student {
    private String name;
    private Integer age;
    private School school;

//    public Student(String name, Integer age, School school) {
//        this.name = name;
//        this.age = age;
//        this.school = school;
//        System.out.println("Student有参构造器执行完毕。。。");
//    }

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

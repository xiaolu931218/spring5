package com.bjpn.ba01.service.impl;

import com.bjpn.ba01.aspect.Student;
import com.bjpn.ba01.service.SomeService;

public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome(String name, Integer age) {
        System.out.println("===目标方法doSome（）====");
    }

    @Override
    public Student doReturn(String name, Integer age) {
        return new Student(name, age);
    }

    @Override
    public Student doFirst(String name, Integer age) {
        System.out.println("====业务方法====");
        return new Student(name, age);
    }

}

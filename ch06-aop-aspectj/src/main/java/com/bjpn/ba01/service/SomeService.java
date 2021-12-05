package com.bjpn.ba01.service;

import com.bjpn.ba01.aspect.Student;

public interface SomeService {
    void doSome(String name,Integer age);

    Student doReturn(String name, Integer age);
}

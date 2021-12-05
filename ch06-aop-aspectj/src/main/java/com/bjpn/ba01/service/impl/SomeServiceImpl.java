package com.bjpn.ba01.service.impl;

import com.bjpn.ba01.service.SomeService;

public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome(String name, Integer age) {
        System.out.println("===目标方法doSome（）====");
    }
}

package com.bjpn.service.impl;

import com.bjpn.service.SomeService;

public class SomeServiceImpl implements SomeService {
    public SomeServiceImpl() {
        System.out.println("执行构造器。。。");
    }

    @Override
    public void doSome() {
        System.out.println("我在做事情！！！");
    }
}

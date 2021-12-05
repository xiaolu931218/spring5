package com.bjpn.ba01.service.impl;

import com.bjpn.ba01.service.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SomeServiceImplTest{
    String config = "application-context.xml";

    @Test
    public void test01() {
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        SomeService someServiceProxy = (SomeService) ac.getBean("someService");
        someServiceProxy.doSome("张三", 19);
        System.out.println(someServiceProxy.getClass().getName());
    }
}
package com.bjpn.ba01.service.impl;

import com.bjpn.ba01.service.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SomeServiceImplTest{
    String config = "application-context.xml";

    /**
     * 前置通知
     */
    @Test
    public void test01() {
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        SomeService someServiceProxy = (SomeService) ac.getBean("someService");
        someServiceProxy.doSome("张三", 19);
        System.out.println(someServiceProxy.getClass().getName());
    }

    /**
     * 后置通知
     */
    @Test
    public void test02() {
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        SomeService someServiceProxy = (SomeService) ac.getBean("someService");
        System.out.println("方法调用点返回的对象：" + someServiceProxy.doReturn("张三", 19));
        System.out.println("方法调用点的线程：" + Thread.currentThread().getName());
    }

    /**
     * 环绕通知
     */
    @Test
    public void test03() {
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        SomeService someServiceProxy = (SomeService) ac.getBean("someService");
        System.out.println("方法调用点返回的对象：" + someServiceProxy.doFirst("张三", 19));

    }
}
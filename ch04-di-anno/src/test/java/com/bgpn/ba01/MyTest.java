package com.bgpn.ba01;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    String config = "applicationContext.xml";
    @Test
    public void test01() {

        // 测试@value{"${}"}
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Student student = (Student) ac.getBean("myStudent");

        System.out.println(student);

    }

}
package com.bjpn.ba05;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest05 {

    String config = "ba05/spring-total.xml";

    @Test
    public void test() {

        // 测试多个配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Student student = (Student) ac.getBean("myStudent");

        System.out.println(student);

    }


}

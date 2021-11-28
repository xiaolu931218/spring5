package com.bjpn;

import com.bjpn.service.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class MyTest {

    @Test
    public void test02() {
        String config = "beans.xml";
        // 绝对路径获取上下文
//        ApplicationContext ac = new FileSystemXmlApplicationContext("E:\\IdeaProjects\\beans.xml");
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        SomeService service = (SomeService) ac.getBean("someServiceImpl");
        service.doSome();

        // spring默认是单例
        SomeService service1 = (SomeService) ac.getBean("someServiceImpl");
        System.out.println(service1 == service);

    }

    @Test
    public void test03() {
        String config = "beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Date localDate = (Date) ac.getBean("myDate");
        System.out.println(localDate);


    }
}

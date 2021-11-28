package com.bjpn;

import com.bjpn.ba01.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.util.Date;

public class MyTest {

    String config = "ba01/applicationContext.xml";

    @Test
    public void test02() {

        // 绝对路径获取上下文
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Student student = (Student) ac.getBean("myStudent");

        System.out.println(student);

    }

    @Test
    public void test03() {
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Date localDate = (Date) ac.getBean("myDate");
        System.out.println(localDate);
    }

    @Test
    public void test04() {
        // 测试属性是对象
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        com.bjpn.ba02.Student myStudent2 = (com.bjpn.ba02.Student) ac.getBean("myStudent2");
        System.out.println(myStudent2);
    }

    @Test
    public void test05() {
        // 测试构造器注入
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
//        com.bjpn.ba03.Student myStudent = (com.bjpn.ba03.Student) ac.getBean("myStudent3");
        com.bjpn.ba03.Student myStudent = (com.bjpn.ba03.Student) ac.getBean("myStudent4");
        System.out.println(myStudent);
    }

    @Test
    public void test06() {
        // 测试构造器注入读取文件
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        File acBean = (File) ac.getBean("myFile");
        System.out.println(acBean);
    }

    @Test
    public void test07() {
        // 使用autowire
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        com.bjpn.ba03.Student acBean = (com.bjpn.ba03.Student) ac.getBean("myStudent5");
        System.out.println(acBean);
    }
}

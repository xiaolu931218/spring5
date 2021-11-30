package com.bgpn.ba01;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Component 创建对象，等同于bean标签
 *
 */
@Component(value = "myStudent")
public class Student {
    @Value("${name}")
    private String name;
    private Integer age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

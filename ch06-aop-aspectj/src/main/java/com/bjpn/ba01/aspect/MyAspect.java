package com.bjpn.ba01.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.time.LocalDateTime;

/**
 * @Aspect：是aspectJ框架中注解
 * 作用：表示当前类是切面类
 * 切面类：给业务方法增加功能的类，在这个类中有切面的功能代码
 * 位置；在类定义的上面
 */
@Aspect
public class MyAspect {

    /**
     * 定义方法：方法是实现切面功能的
     * 方法的定义要求：
     * 1、公共方法public
     * 2、方法没有返回值
     * 3、方法名称自定义
     * 4、方法可以有参数，也可以没有参数
     *  如果有参数，参数不是自定义的，有几个参数类型可以使用
     */

    /**
     * @Before注解：前置通知注解
     * 属性：value：切入点表达式，表示切面的功能执行的位置
     * 位置；在方法的上面
     * 特点：
     *  1、在目标方法之前执行
     *  2、不会改变目标方法的执行结果
     *  3、不会影响目标方法的执行
     */
    @Before(value = "execution(public void doSome(String ,Integer ))")
    public void myBefore() {
        /**
         * 切面要执行的功能代码
         */
        System.out.println("切面功能：前置通知，在目标方法执行前输出当前时间》》》"+ LocalDateTime.now());
    }

}

package com.bjpn.ba01.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.time.LocalDateTime;
import java.util.Arrays;

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
    public void myBefore(JoinPoint jp) {
        /**
         * 切面要执行的功能代码
         */
        System.out.println("切面功能：前置通知，在目标方法执行前输出当前时间》》》"+ LocalDateTime.now());
        // 切点方法的签名void com.bjpn.ba01.service.SomeService.doSome(String,Integer)
        System.out.println(jp.getSignature());
        // 切点方法的所在类 com.bjpn.ba01.service.impl.SomeServiceImpl@491b9b8
        System.out.println(jp.getThis());
        // 切点方法的名称 doSome
        System.out.println(jp.getSignature().getName());
        // 切点方法的实参 [张三, 19]
        System.out.println(Arrays.toString(jp.getArgs()));
    }

    /**
     * 后置通知
     * @param res
     */
    @AfterReturning(value = "execution(public Student doReturn(String ,Integer))",returning="res")
    public void myAfter(Object res) {
        /**
         * 切面要执行的功能代码
         */
        System.out.println("切面功能：后置通知，在目标方法执行后获取返回值》》》" + res);
//        Student student = (Student) res;
//        // 这里测试切面修改返回值，是否会对调用点有影响。答案：会
//        student.setName("李四");
        // 这里测试切面修改返回值，是否会对调用点有影响。答案：否
        res = new Student("lisi", 18);
        System.out.println("切面功能的线程》》》" +Thread.currentThread().getName());
    }

}

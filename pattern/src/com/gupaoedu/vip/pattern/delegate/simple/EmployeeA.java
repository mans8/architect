package com.gupaoedu.vip.pattern.delegate.simple;

/**
 * @author: Mr.Wong
 * @create: 2019-06-28
 **/
public class EmployeeA implements IEmployee{

    @Override
    public void doing(String command) {
        System.out.println("我是员工A，我现在开始干" + command +"工作");
    }
}

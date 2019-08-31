package com.gupaoedu.vip.pattern.proxy.simpleproxy;

/**
 * @author: Mr.Wong
 * @create: 2019-06-28
 **/
public class RealSubject implements Subject{

    @Override
    public void request(){
        System.out.println("real service is called");
    }


}

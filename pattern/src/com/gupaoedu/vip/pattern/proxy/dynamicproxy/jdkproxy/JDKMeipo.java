package com.gupaoedu.vip.pattern.proxy.dynamicproxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author: Mr.Wong
 * @create: 2019-06-28
 **/
public class JDKMeipo implements InvocationHandler {

    private Object target;

    public Object getInstance(Object target) throws Exception{
        this.target = target;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object obj = method.invoke(this.target,args);
        after();
        return null;
    }

    private void before(){
        System.out.println("我是媒婆，我要给你介绍对象，现在已经确认你需求");
        System.out.println("开始物色");
    }

    private void after(){
        System.out.println("ok的话，准备办事");
    }
}

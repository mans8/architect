package com.gupaoedu.vip.pattern.proxy.dynamicproxy.jdkproxy;

import java.lang.reflect.Method;

/**
 * @author: Mr.Wong
 * @create: 2019-06-28
 **/
public class JDKProxyTest {

    public static void main(String[] args) {
        try {
            Object obj = new JDKMeipo().getInstance(new Girl());
            Method method = obj.getClass().getMethod("findLove",null);
            method.invoke(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

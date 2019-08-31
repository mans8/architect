package com.gupaoedu.vip.pattern.proxy.dynamicproxy.gpproxy;

import java.lang.reflect.Method;

/**
 * @author: Mr.Wong
 * @create: 2019-06-28
 **/
public interface GPInvocationHandler {

    public Object invoke(Object proxy, Method method,Object[] args)
        throws Throwable;

}

package com.gupaoedu.vip.pattern.proxy.dbroute.proxy;

import com.gupaoedu.vip.pattern.proxy.dbroute.db.DynamicDataSourceEntity;
import com.gupaoedu.vip.pattern.proxy.dynamicproxy.gpproxy.GPClassLoader;
import com.gupaoedu.vip.pattern.proxy.dynamicproxy.gpproxy.GPInvocationHandler;
import com.gupaoedu.vip.pattern.proxy.dynamicproxy.gpproxy.GPProxy;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: Mr.Wong
 * @create: 2019-06-28
 **/
public class OrderServiceDynamicProxy implements GPInvocationHandler {

    private SimpleDateFormat dateyyyy = new SimpleDateFormat("yyyy");

    Object proxyObj;

    public Object getInstance(Object proxyObj){
        this.proxyObj = proxyObj;
        Class<?> clazz = proxyObj.getClass();
        return GPProxy.newProxyInstance(new GPClassLoader(),clazz.getInterfaces(),this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before(args[0]);
        Object object = method.invoke(proxyObj,args);
        after();
        return null;
    }

    //target应该是订单对象order
    private void before(Object target){
        try{
            //进行数据源切换
            System.out.println("Proxy before method");

            //约定由于配置
            Long time = (Long)target.getClass().getMethod("getCreateTime").invoke(target);
            Integer dbRouter = Integer.valueOf(dateyyyy.format(new Date(time)));
            System.out.println("静态代理类自动分配到【DB_" + dbRouter +"】数据源处理数据");
            DynamicDataSourceEntity.set(dbRouter);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void after(){
        System.out.println("Proxy after method");
        //还原成默认的数据源
        DynamicDataSourceEntity.restore();
    }




}

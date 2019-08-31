package com.gupaoedu.vip.pattern.proxy.dynamicproxy.gpproxy;

import com.gupaoedu.vip.pattern.proxy.Person;
import com.gupaoedu.vip.pattern.proxy.dynamicproxy.jdkproxy.Girl;

/**
 * @author: Mr.Wong
 * @create: 2019-06-28
 **/
public class GPProxyTest {

    public static void main(String[] args){
        try{
            //jdk动态代理的实现原理
            Person obj = (Person)new GPMeipo().getInstance(new Girl());
            System.out.println(obj.getClass());
            obj.findLove();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}

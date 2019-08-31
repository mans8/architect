package com.gupaoedu.vip.pattern.proxy.staticproxy;

import com.gupaoedu.vip.pattern.proxy.Person;

/**
 * @author: Mr.Wong
 * @create: 2019-06-28
 **/
public class Son implements Person {
    @Override
    public void findLove() {
        System.out.println("儿子要求，肤白貌美大长腿");
    }

    public void findJob(){}

    public void eat(){}
}

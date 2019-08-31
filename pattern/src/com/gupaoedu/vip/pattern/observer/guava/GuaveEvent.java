package com.gupaoedu.vip.pattern.observer.guava;

import com.google.common.eventbus.Subscribe;

/**
 * @author: Mr.Wong
 * @create: 2019-06-29
 **/
public class GuaveEvent {

    @Subscribe
    public void subscribe(String str){
        System.out.println("执行sybscribe方法，传入的参数是：" + str);
    }
}

package com.gupaoedu.vip.pattern.observer.guava;

import com.google.common.eventbus.EventBus;

/**
 * @author: Mr.Wong
 * @create: 2019-06-29
 **/
public class GuaveEventTest {

    public static void main(String[] args) {
        //消息总线
        EventBus eventBus = new EventBus();
        GuaveEvent guaveEvent = new GuaveEvent();
        eventBus.register(guaveEvent);
        eventBus.post("kobe");
    }
}

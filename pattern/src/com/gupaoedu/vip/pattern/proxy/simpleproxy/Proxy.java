package com.gupaoedu.vip.pattern.proxy.simpleproxy;

/**
 * @author: Mr.Wong
 * @create: 2019-06-28
 **/
public class Proxy implements Subject {

    private Subject subject;

    public Proxy(Subject subject){
        this.subject = subject;
    }

    public void request(){
        before();
        subject.request();
        after();
    }

    public void before(){
        System.out.println("called before request()");
    }

    public void after(){
        System.out.println("called after request()");
    }




}

package com.gupaoedu.vip.pattern.proxy.simpleproxy;

/**
 * @author: Mr.Wong
 * @create: 2019-06-28
 **/
public class Client {

    public static void main(String[] args) {
        Proxy proxy = new Proxy(new RealSubject());
        proxy.request();
    }


}

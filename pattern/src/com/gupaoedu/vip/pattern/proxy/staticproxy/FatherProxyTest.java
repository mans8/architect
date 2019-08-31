package com.gupaoedu.vip.pattern.proxy.staticproxy;

/**
 * @author: Mr.Wong
 * @create: 2019-06-28
 **/
public class FatherProxyTest {

    public static void main(String[] args) {
        Father father = new Father(new Son());
        father.findLove();
    }

}

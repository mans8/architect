package com.gupaoedu.vip.pattern.delegate.simple;

/**
 * @author: Mr.Wong
 * @create: 2019-06-28
 **/
public class DelegateTest {

    public static void main(String[] args) {
        new Boss().command("登录",new Leader());
    }

}

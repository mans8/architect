package com.gupaoedu.vip.pattern.adapter.loginadapter.v2;

/**
 * @author: Mr.Wong
 * @create: 2019-06-29
 **/
public class PassportTest {

    public static void main(String[] args) {

        IPassportForThird passportForThird = new PassportForThirdAdapter();

        passportForThird.loginForQQ("");

    }

}

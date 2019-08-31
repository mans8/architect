package com.gupaoedu.vip.pattern.adapter.loginadapter.v1;

import com.gupaoedu.vip.pattern.adapter.loginadapter.v1.service.SinginForThirdService;

/**
 * @author: Mr.Wong
 * @create: 2019-06-29
 **/
public class SiginForThirdServiceTest {

    public static void main(String[] args) {

        SinginForThirdService service = new SinginForThirdService();
        service.login("hgx","123456");
        service.loginForQQ("sdfasdfasf");
        service.loginForWechat("sdfasfsa");

    }

}

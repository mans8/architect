package com.gupaoedu.vip.pattern.adapter.loginadapter.v2.adapters;

import com.gupaoedu.vip.pattern.adapter.loginadapter.ResultMsg;

/**
 * @author: Mr.Wong
 * @create: 2019-06-29
 * 在适配中，这个接口可有可无，模板模式一定是抽象类，这里仅仅就只是个接口
 **/
public interface LoginAdapter {

    boolean support(Object adapter);

    ResultMsg login(String id,Object adapter);

}

package com.gupaoedu.vip.pattern.adapter.loginadapter.v2.adapters;

import com.gupaoedu.vip.pattern.adapter.loginadapter.ResultMsg;

/**
 * @author: Mr.Wong
 * @create: 2019-06-29
 **/
public interface RegistAdapter {

    boolean support(Object adapter);

    ResultMsg login(String id,Object adapter);

}

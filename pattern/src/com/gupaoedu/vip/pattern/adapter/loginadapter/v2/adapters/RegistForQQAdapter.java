package com.gupaoedu.vip.pattern.adapter.loginadapter.v2.adapters;

import com.gupaoedu.vip.pattern.adapter.loginadapter.ResultMsg;

/**
 * @author: Mr.Wong
 * @create: 2019-06-29
 **/
public class RegistForQQAdapter implements RegistAdapter,LoginAdapter {
    @Override
    public boolean support(Object adapter) {
        return false;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}

package com.gupaoedu.vip.pattern.adapter.loginadapter.v1.service;

import com.gupaoedu.vip.pattern.adapter.loginadapter.Member;
import com.gupaoedu.vip.pattern.adapter.loginadapter.ResultMsg;

/**
 * @author: Mr.Wong
 * @create: 2019-06-29
 **/
public class SiginService {

    //注册方法
    public ResultMsg regist(String username,String password){

        return new ResultMsg(200,"注册成功",new Member());

    }

    //登录方法
    public ResultMsg login(String username,String password){

        return null;

    }


}

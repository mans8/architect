package com.gupaoedu.vip.pattern.delegate.simple;

/**
 * @author: Mr.Wong
 * @create: 2019-06-28
 **/
public class Boss {

    public void command(String command,Leader leader){
        leader.doing(command);
    }
}

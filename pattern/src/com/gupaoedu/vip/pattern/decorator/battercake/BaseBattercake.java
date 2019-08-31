package com.gupaoedu.vip.pattern.decorator.battercake;

/**
 * @author: Mr.Wong
 * @create: 2019-06-29
 * 基础版煎饼，什么都不加
 **/
public class BaseBattercake extends Battercake{

    protected String getMsg(){
        return "煎饼";
    }

    protected int getPrice(){
        return 5;
    }

}

package com.gupaoedu.vip.pattern.decorator.battercake;

/**
 * @author: Mr.Wong
 * @create: 2019-06-29
 **/
public class EggDecorator extends BattercakeDecorator{

    public EggDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    protected void doSomething() {

    }

    @Override
    protected String getMsg(){
        return super.getMsg() + "+1个鸡蛋";
    }

    @Override
    protected int getPrice(){
        return super.getPrice() + 1;
    }


}

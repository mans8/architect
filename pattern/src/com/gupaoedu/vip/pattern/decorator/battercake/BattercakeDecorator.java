package com.gupaoedu.vip.pattern.decorator.battercake;

/**
 * @author: Mr.Wong
 * @create: 2019-06-29
 **/
public abstract class BattercakeDecorator extends Battercake {

    //静态代理
    private Battercake battercake;

    public BattercakeDecorator(Battercake battercake) {
        this.battercake = battercake;
    }

    protected abstract void doSomething();

    @Override
    protected String getMsg() {
        return this.battercake.getMsg();
    }

    @Override
    protected int getPrice() {
        return this.battercake.getPrice();
    }
}

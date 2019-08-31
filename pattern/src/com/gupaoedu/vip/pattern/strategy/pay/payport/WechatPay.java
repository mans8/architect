package com.gupaoedu.vip.pattern.strategy.pay.payport;

/**
 * @author: Mr.Wong
 * @create: 2019-06-28
 **/
public class WechatPay extends Payment{
    @Override
    public String getName() {
        return "微信支付";
    }

    @Override
    protected Double queryBalance(String uid) {
        return 2020.0;
    }
}

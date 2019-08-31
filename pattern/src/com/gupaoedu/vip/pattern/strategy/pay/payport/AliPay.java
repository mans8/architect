package com.gupaoedu.vip.pattern.strategy.pay.payport;

/**
 * @author: Mr.Wong
 * @create: 2019-06-28
 **/
public class AliPay extends Payment{


    @Override
    public String getName() {
        return "支付宝";
    }

    @Override
    protected Double queryBalance(String uid) {
        return 900.0;
    }
}

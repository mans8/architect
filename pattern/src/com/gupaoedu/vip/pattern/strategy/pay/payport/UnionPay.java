package com.gupaoedu.vip.pattern.strategy.pay.payport;

/**
 * @author: Mr.Wong
 * @create: 2019-06-28
 **/
public class UnionPay extends Payment{
    @Override
    public String getName() {
        return "银联支付";
    }

    @Override
    protected Double queryBalance(String uid) {
        return 120.0;
    }
}

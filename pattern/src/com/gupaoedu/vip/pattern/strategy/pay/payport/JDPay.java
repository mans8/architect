package com.gupaoedu.vip.pattern.strategy.pay.payport;

/**
 * @author: Mr.Wong
 * @create: 2019-06-28
 **/
public class JDPay extends Payment{
    @Override
    public String getName() {
        return "京东白条";
    }

    @Override
    protected Double queryBalance(String uid) {
        return 500.0;
    }
}

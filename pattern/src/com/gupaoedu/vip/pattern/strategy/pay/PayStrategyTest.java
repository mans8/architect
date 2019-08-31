package com.gupaoedu.vip.pattern.strategy.pay;

import com.gupaoedu.vip.pattern.strategy.pay.payport.PayStrategy;

/**
 * @author: Mr.Wong
 * @create: 2019-06-28
 **/
public class PayStrategyTest {

    public static void main(String[] args) {

        //直接从点单开始
        Order order = new Order("1","2019062810101001",325.4);
        //开始支付
        System.out.println(order.pay(PayStrategy.ALI_PAY));
    }

}

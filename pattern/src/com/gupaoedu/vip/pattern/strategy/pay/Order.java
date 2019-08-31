package com.gupaoedu.vip.pattern.strategy.pay;

import com.gupaoedu.vip.pattern.strategy.pay.payport.PayStrategy;
import com.gupaoedu.vip.pattern.strategy.pay.payport.Payment;

/**
 * @author: Mr.Wong
 * @create: 2019-06-28
 **/
public class Order {

    private String uid;
    private String orderId;
    private double amount;

    public Order(String uid,String orderId,double amount){
        this.uid = uid;
        this.orderId = orderId;
        this.amount = amount;
    }

    //完美解决switch过程
    public MsgResult pay(){
        return pay(PayStrategy.DEFAULT_PAY);
    }

    public MsgResult pay(String payKey){
        Payment payment = PayStrategy.get(payKey);
        System.out.println("欢迎使用" + payment.getName());
        System.out.println("本次交易金额为：" + amount + "，开始扣款");
        return payment.pay(uid,amount);
    }

}

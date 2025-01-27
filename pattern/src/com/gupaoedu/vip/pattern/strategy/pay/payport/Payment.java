package com.gupaoedu.vip.pattern.strategy.pay.payport;

import com.gupaoedu.vip.pattern.strategy.pay.MsgResult;

/**
 * @author: Mr.Wong
 * @create: 2019-06-28
 **/
public abstract class Payment {

    //支付类型
    public abstract String getName();

    //查询余额
    protected abstract Double queryBalance(String uid);

    //扣款支付
    public MsgResult pay(String uid, double amount){
        if (queryBalance(uid) < amount){
            return new MsgResult(500,"支付失败","余额不足");
        }
        return new MsgResult(200,"支付成功","支付金额:" + amount);
    }

}

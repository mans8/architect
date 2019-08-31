package com.gupaoedu.vip.pattern.strategy.pay.payport;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: Mr.Wong
 * @create: 2019-06-28
 **/
public class PayStrategy {

    public static final String ALI_PAY = "AliPay";
    public static final String JD_PAY = "JDPay";
    public static final String UNION_PAY = "UnionPay";
    public static final String WECHAT_PAY = "WechatPay";
    public static final String DEFAULT_PAY = "AliPay";

    private static Map<String,Payment> payStrategy = new HashMap<String, Payment>();
    static {
        payStrategy.put(ALI_PAY,new AliPay());
        payStrategy.put(WECHAT_PAY,new WechatPay());
        payStrategy.put(JD_PAY,new JDPay());
        payStrategy.put(UNION_PAY,new UnionPay());
    }

    public static Payment get(String payKey){
        if (!payStrategy.containsKey(payKey)){
            return payStrategy.get(DEFAULT_PAY);
        }
        return payStrategy.get(payKey);
    }



}

package com.gupaoedu.vip.pattern.strategy.promotion;

/**
 * @author: Mr.Wong
 * @create: 2019-06-29
 **/
public class CasebackStrategy implements PromotionStrategy{


    @Override
    public void doPromotion() {
        System.out.println("返现促销，返回金额到支付宝！");
    }
}

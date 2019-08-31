package com.gupaoedu.vip.pattern.strategy.promotion;

/**
 * @author: Mr.Wong
 * @create: 2019-06-29
 **/
public class EmptyStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("无促销活动");
    }
}

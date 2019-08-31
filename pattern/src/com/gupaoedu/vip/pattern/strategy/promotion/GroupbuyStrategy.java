package com.gupaoedu.vip.pattern.strategy.promotion;

/**
 * @author: Mr.Wong
 * @create: 2019-06-29
 **/
public class GroupbuyStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("拼团满二十人成团，享受团购价");
    }
}

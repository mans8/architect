package com.gupaoedu.vip.pattern.strategy.promotion;

/**
 * @author: Mr.Wong
 * @create: 2019-06-29
 **/
public class CouponStrategy implements PromotionStrategy{

    @Override
    public void doPromotion() {
        System.out.println("领取优惠券，课程价格直接减免优惠券抵扣");
    }
}

package com.gupaoedu.vip.pattern.strategy.promotion;

/**
 * @author: Mr.Wong
 * @create: 2019-06-29
 **/
public class PromotionActivityTest {

    public static void main(String[] args) {

        PromotionActivity activity618 = new PromotionActivity(new CouponStrategy());
        PromotionActivity activity1111 = new PromotionActivity(new CasebackStrategy());

        activity618.execute();
        activity1111.execute();
    }

}

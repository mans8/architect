package com.gupaoedu.vip.pattern.strategy.promotion;

/**
 * @author: Mr.Wong
 * @create: 2019-06-29
 **/
public class PromotionActivity {

    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy){
        this.promotionStrategy = promotionStrategy;
    }

    public void execute(){
        promotionStrategy.doPromotion();
    }

}

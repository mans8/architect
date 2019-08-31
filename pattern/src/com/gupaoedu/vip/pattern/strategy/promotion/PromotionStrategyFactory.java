package com.gupaoedu.vip.pattern.strategy.promotion;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: Mr.Wong
 * @create: 2019-06-29
 **/
public class PromotionStrategyFactory {

    private static Map<String,PromotionStrategy> PROMOTION_STRATEGY_MAP = new HashMap<String,PromotionStrategy>();

    static {
        PROMOTION_STRATEGY_MAP.put(PromotionKey.COUPON,new CouponStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.CASEBACK,new CouponStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.GROUPBUY,new CouponStrategy());
    }

    private static final PromotionStrategy NON_PROMOTO = new EmptyStrategy();

    private PromotionStrategyFactory(){}

    public static PromotionStrategy getPromotionStrategy(String promotionKey){
        PromotionStrategy promotionStrategy = PROMOTION_STRATEGY_MAP.get(promotionKey);
        return promotionStrategy == null ? NON_PROMOTO : promotionStrategy;
    }

    private interface PromotionKey{
        String COUPON = "COUPON";
        String CASEBACK = "CASEBACK";
        String GROUPBUY = "GROUPBUY";
    }

}

package com.gupaoedu.vip.pattern.proxy.dbroute;

/**
 * @author: Mr.Wong
 * @create: 2019-06-28
 **/
public class Order {

    //订单创建时间进行按年分库
    private Long createTime;
    private Object orderInfo;
    private String id;

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Object getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(Object orderInfo) {
        this.orderInfo = orderInfo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

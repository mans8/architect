package com.gupaoedu.vip.pattern.proxy.dbroute;

/**
 * @author: Mr.Wong
 * @create: 2019-06-28
 **/
public class OrderService implements IOrderService{

    private OrderDao orderDao;

    public OrderService(){
        //如果spring应该是自动注入的
        //为了使用方便，直接在构造方法中初始化
        orderDao = new OrderDao();
    }

    public int createOrder(Order order) {
        System.out.println("OrderService调用orderDao常见订单");
        return orderDao.insert((com.gupaoedu.vip.pattern.proxy.dbroute.Order) order);
    }
}

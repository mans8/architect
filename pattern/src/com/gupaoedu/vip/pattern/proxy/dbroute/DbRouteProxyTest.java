package com.gupaoedu.vip.pattern.proxy.dbroute;

import com.gupaoedu.vip.pattern.proxy.dbroute.proxy.OrderServiceDynamicProxy;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: Mr.Wong
 * @create: 2019-06-28
 **/
public class DbRouteProxyTest {

    public static void main(String[] args){
        try {
            Order order = new Order();

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            Date date = sdf.parse("2017/01/02");
            order.setCreateTime(date.getTime());

            IOrderService orderService = (IOrderService) new OrderServiceDynamicProxy().getInstance(new OrderService());
            orderService.createOrder(order);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

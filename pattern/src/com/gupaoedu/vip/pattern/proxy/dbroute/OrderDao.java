package com.gupaoedu.vip.pattern.proxy.dbroute;

/**
 * @author: Mr.Wong
 * @create: 2019-06-28
 **/
public class OrderDao {

    public int insert(Order order){
        System.out.println("OrderDao创建Order成功！");
        return 1;
    }

}

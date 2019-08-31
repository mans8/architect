package com.gupaoedu.vip.pattern.proxy.dynamicproxy.cglibproxy;

import org.springframework.cglib.core.DebuggingClassWriter;

/**
 * @author: Mr.Wong
 * @create: 2019-06-28
 **/
public class CGlibTest {

    public static void main(String[] args) {
        try{
            System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,
                    "D://development/GupaoWorkspace/pattern/src/com/gupaoedu/vip/pattern/proxy/dynamicproxy/cglibproxy/cglib_proxy_classes");
            Customer obj = (Customer) new CGlibMeipo().getInstance(Customer.class);
            System.out.println(obj);
            obj.findLove();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

package com.hgx.hello.dubbo.service.user.consumer.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.hgx.hello.dubbo.service.user.api.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hgx
 * @date 2019/9/8 0:58
 * @Description
 */
@RestController
public class UserController {

    @Reference(version = "${user.service.version}")
    private UserService userService;

    @HystrixCommand(fallbackMethod = "hiError")
    @RequestMapping(value = "hi",method = RequestMethod.GET)
    public String sayHi(){
        return userService.sayHi();
    }

    //熔断方法
    public String hiError(){
        return "Hello Hystrix";
    }
}

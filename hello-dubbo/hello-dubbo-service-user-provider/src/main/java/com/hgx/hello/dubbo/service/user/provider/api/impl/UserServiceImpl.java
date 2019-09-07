package com.hgx.hello.dubbo.service.user.provider.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.hgx.hello.dubbo.service.user.api.UserService;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author hgx
 * @date 2019/9/7 22:45
 * @Description
 */
@Service(version = "${user.service.version}")
public class UserServiceImpl implements UserService {

    @Value("${dubbo.protocol.port}")
    private String port;

    @Override
    public String sayHi() {
        return "hello dubbo, I'm from port:" + port;
    }
}

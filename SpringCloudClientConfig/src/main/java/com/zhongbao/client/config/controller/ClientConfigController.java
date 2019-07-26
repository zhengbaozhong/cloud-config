package com.zhongbao.client.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: ClientConfigController
 * @Author: zhengbaozhong
 * @Description: ${description}
 * @Date: 2019/7/26 9:35
 * @Version: 1.0
 */

@RefreshScope //使用该注解的类，会在接到SpringCloud配置中心配置刷新的时候，自动将新的配置更新到该类对应的字段中
@RestController
public class ClientConfigController {

    //获取配置文件中的neo.hello=hello im dev update in 1的value
    @Value("${neo.hello}")
    private String hello;

    @RequestMapping("hello")
    public String getHello(){
        return this.hello;
    }
}

package com.zhongbao.client.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName: SpringCloudClientConfigApplication
 * @Author: zhengbaozhong
 * @Description: 客户端获取服务端配置信息
 * @Date: 2019/7/26 9:29
 * @Version: 1.0
 */
@SpringBootApplication
public class SpringCloudClientConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudClientConfigApplication.class,args);
    }
}

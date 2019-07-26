package com.zhongbao.server.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @ClassName: SpringCloudServerConfigApplication
 * @Author: zhengbaozhong
 * @Description: ${description}
 * @Date: 2019/7/26 9:08
 * @Version: 1.0
 */
@EnableConfigServer
@SpringBootApplication
public class SpringCloudServerConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudServerConfigApplication.class,args);
    }
}

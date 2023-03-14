package com.leyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author GengXuelong
 * @version 1.0
 * @email 3349495429@qq.com
 * @Date 2023/1/3 13:14
 * @className LeyouRegistry
 * @description:
 */
@SpringBootApplication
@EnableEurekaServer
public class LeyouRegistry {
    public static void main(String[] args) {
        SpringApplication.run(LeyouRegistry.class);
    }
}

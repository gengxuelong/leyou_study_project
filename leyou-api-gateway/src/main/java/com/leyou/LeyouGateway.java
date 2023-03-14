package com.leyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author GengXuelong
 * @version 1.0
 * @email 3349495429@qq.com
 * @Date 2023/1/3 13:21
 * @className LeyouGateway
 * @description:
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class LeyouGateway {
    public static void main(String[] args) {
        SpringApplication.run(LeyouGateway.class);
    }
}

package com.leyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author GengXuelong
 * @version 1.0
 * @email 3349495429@qq.com
 * @Date 2023/1/4 14:42
 * @className ItemService
 * @description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ItemService {
    public static void main(String[] args) {
        SpringApplication.run(ItemService.class);
    }
}

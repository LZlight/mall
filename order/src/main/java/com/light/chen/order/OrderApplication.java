package com.light.chen.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author light
 * @Date 2020/5/21 2:12 下午
 */
@SpringBootApplication(
        scanBasePackages = {
                "com.light.chen.**"
        })
@MapperScan(basePackages={"com.light.chen.order.mapper"})
@EnableDiscoveryClient
@EnableFeignClients
public class OrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class,args);
    }
}

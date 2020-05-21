package com.light.chen.user;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author light
 * @Date 2020/5/21 2:12 下午
 */
@SpringBootApplication(
        exclude= {DruidDataSourceAutoConfigure.class},
        scanBasePackages = {
                "com.light.chen.**"
        })
@EnableDiscoveryClient
public class UserApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class,args);
    }
}

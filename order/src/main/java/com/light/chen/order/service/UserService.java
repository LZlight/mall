package com.light.chen.order.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author light
 * @Date 2020/5/21 4:38 下午
 */
@FeignClient("user")
public interface UserService {

    @RequestMapping("/user/test")
    String testFeign();

}

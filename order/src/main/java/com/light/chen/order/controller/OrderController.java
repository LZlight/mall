package com.light.chen.order.controller;

import com.light.chen.order.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author light
 * @Date 2020/5/21 4:42 下午
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private UserService userService;


    @RequestMapping("/test")
    public String test(){
        return userService.testFeign();
    }
}

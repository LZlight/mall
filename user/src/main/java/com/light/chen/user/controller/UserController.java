package com.light.chen.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author light
 * @Date 2020/5/21 3:41 下午
 */
@RestController
@RequestMapping("/user")
public class UserController {


    @RequestMapping("/test")
    public String test(){
        return "SUCCESS";
    }

}

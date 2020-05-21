package com.light.chen.user.controller;

import com.light.chen.user.entity.User;
import com.light.chen.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author light
 * @Date 2020/5/21 3:41 下午
 */
@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/getByPhone")
    public User getByPhone(String phone){
        return userMapper.selectByPhone(phone);
    }

}

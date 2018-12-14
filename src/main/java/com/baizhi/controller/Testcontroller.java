package com.baizhi.controller;


import com.baizhi.entity.User;
import com.baizhi.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Test")
public class Testcontroller {
    @Autowired
    private UserMapper userMapper;
    @RequestMapping("test")
    public List<User> test() {
        List<User> users = userMapper.selectAll();
        return users ;
    }
}
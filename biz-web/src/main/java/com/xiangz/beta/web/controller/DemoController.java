package com.xiangz.beta.web.controller;

import com.xiangz.beta.biz.server.DemoService;
import com.xiangz.beta.biz.server.UserService;
import com.xiangz.beta.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo")
public class DemoController {

    @Autowired
    private DemoService demoService;

    @GetMapping("test")
    public String test() {
        return "Hello World!";
    }

    @GetMapping("biz")
    public String biz() {
        return demoService.test();
    }


    @Autowired
    UserMapper userMapper;

    @GetMapping("dao")
    public Object dao() {
        return userMapper.selectById(2);
    }

    @Autowired
    UserService userService;

    @GetMapping("dao2")
    public Object dao2() {
        return userService.list();
    }
}
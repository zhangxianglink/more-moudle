package com.xiangz.beta.biz.server;

import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService{
    @Override
    public String test() {
        return "test beta-biz";
    }
}

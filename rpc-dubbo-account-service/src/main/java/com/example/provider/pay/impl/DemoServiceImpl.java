package com.example.provider.pay.impl;

import com.example.provider.pay.DemoService;

public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
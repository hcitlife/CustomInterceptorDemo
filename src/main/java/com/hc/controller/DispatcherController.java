package com.hc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //注意此处使用的是RestController，否则可能会出现循环请求
public class DispatcherController {

    @RequestMapping("/fun")
    public void fun() {
        System.out.println("fun");
    }
}

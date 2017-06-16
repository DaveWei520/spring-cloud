package com.weiyu.greeting.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author weiyu@gomeholdings.com
 * @description
 * @create 2017/6/16
 */
@RestController
public class GreetingController {
    @Value("${message:World!}")
    private String message;

    @RequestMapping("/hi")
    public String hello() {
        return "Hello, " + message + "!";
    }
}

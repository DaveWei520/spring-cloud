package com.weiyu.greeting.controller;

import com.weiyu.greeting.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author weiyu@gomeholdings.com
 * @description
 * @create 2017/6/15
 */
@RestController
public class GreetingController {
    @Autowired
    private GreetingService greetingService;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return greetingService.hello();
    }

    @RequestMapping(value = "/ribbon",method = RequestMethod.GET)
    public String ribbon(){
        return "this is ribbon";
    }
}

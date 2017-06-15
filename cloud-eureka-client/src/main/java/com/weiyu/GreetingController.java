package com.weiyu;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author weiyu@gomeholdings.com
 * @description
 * @create 2017/6/15
 */
@RestController
@RequestMapping("/greeting")
public class GreetingController {
    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return "hi,this message from port:" +port;
    }
}

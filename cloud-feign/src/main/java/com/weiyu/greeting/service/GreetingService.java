package com.weiyu.greeting.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author weiyu@gomeholdings.com
 * @description
 * @create 2017/6/15
 */
@FeignClient(value = "greeting-service")
public interface GreetingService {
    @RequestMapping(value = "/greeting/hello",method = RequestMethod.GET)
    String hello();
}

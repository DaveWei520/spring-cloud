package com.weiyu.greeting.service.hystrix;

import com.weiyu.greeting.service.GreetingService;
import org.springframework.stereotype.Component;

/**
 * @author weiyu@gomeholdings.com
 * @description
 * @create 2017/6/15
 */
@Component
public class GreetingServiceHystrix implements GreetingService{
    @Override
    public String hello() {
        return "sorry,this is a mistake";
    }
}

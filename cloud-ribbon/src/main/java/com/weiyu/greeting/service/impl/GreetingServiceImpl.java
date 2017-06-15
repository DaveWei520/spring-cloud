package com.weiyu.greeting.service.impl;

import com.weiyu.greeting.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author weiyu@gomeholdings.com
 * @description
 * @create 2017/6/15
 */
@Service
public class GreetingServiceImpl implements GreetingService {
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public String hello() {
        return restTemplate.getForObject("http://greeting-service/greeting/hello",String.class);
    }
}

package com.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author weiyu@gomeholdings.com
 * @description
 * @create 2017/6/15
 */
@SpringBootApplication(scanBasePackages = "com.weiyu")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.weiyu")
public class CloudFeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudFeignApplication.class,args);
    }
}

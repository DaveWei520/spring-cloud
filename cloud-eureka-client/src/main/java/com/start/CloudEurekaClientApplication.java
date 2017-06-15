package com.start;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author weiyu@gomeholdings.com
 * @description
 * @create 2017/6/15
 */
@SpringBootApplication(scanBasePackages = "com.weiyu")
@EnableEurekaClient
public class CloudEurekaClientApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(CloudEurekaClientApplication.class).run(args);
    }
}

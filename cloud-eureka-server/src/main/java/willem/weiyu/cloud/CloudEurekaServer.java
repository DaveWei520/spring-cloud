package willem.weiyu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import lombok.extern.slf4j.Slf4j;

/**
 * @author weiyu
 * @description
 * @create 2017/6/15
 */
@SpringBootApplication
@EnableEurekaServer
@Slf4j
public class CloudEurekaServer {

    public static void main(String[] args) {
        SpringApplication.run(CloudEurekaServer.class, args);
        log.info("start Eureka server");
    }
}

package willem.weiyu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author weiyu
 * @description
 * @create 2017/6/15
 */
@SpringBootApplication
@EnableEurekaServer
public class CloudEurekaServer {

    public static void main(String[] args) {
        SpringApplication.run(CloudEurekaServer.class, args);
    }
}

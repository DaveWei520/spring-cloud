package willem.weiyu.cloud.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author weiyu
 * @description
 * @create 2017/6/15
 */
@SpringBootApplication(scanBasePackages = "willem.weiyu.cloud")
@EnableEurekaServer
public class CloudEurekaServer {

    public static void main(String[] args) {
        SpringApplication.run(CloudEurekaServer.class, args);
    }
}

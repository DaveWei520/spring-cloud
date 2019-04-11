package willem.weiyu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author weiyu
 * @description
 * @create 2017/6/14
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class CloudConfigServer {
    public static void main(String[] args) {
        SpringApplication.run(CloudConfigServer.class,args);
    }
}

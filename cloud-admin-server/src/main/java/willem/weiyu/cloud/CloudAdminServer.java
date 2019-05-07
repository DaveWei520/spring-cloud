package willem.weiyu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

/**
 * @Author weiyu
 * @Description
 * @Date 2019/5/7 15:20
 */
@SpringBootApplication
@EnableEurekaClient
@EnableAdminServer
public class CloudAdminServer {

    public static void main(String[] args) {
        SpringApplication.run(CloudAdminServer.class, args);
    }
}

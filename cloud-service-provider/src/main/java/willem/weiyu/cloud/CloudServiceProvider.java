package willem.weiyu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author weiyu005
 * @Description
 * @Date 2019/4/11 11:00
 */
@SpringBootApplication
@EnableEurekaClient
public class CloudServiceProvider {

    public static void main(String[] args) {
        SpringApplication.run(CloudServiceProvider.class, args);
    }
}

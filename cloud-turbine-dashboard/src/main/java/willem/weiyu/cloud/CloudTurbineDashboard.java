package willem.weiyu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @Author weiyu005
 * @Description
 * @Date 2019/4/11 12:20
 */
@SpringBootApplication
@EnableEurekaClient
@EnableTurbine
@EnableHystrixDashboard
public class CloudTurbineDashboard {

    public static void main(String[] args) {
        SpringApplication.run(CloudTurbineDashboard.class, args);
    }
}

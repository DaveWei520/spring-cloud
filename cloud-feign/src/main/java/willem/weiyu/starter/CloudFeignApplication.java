package willem.weiyu.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author weiyu@gomeholdings.com
 * @description
 * @create 2017/6/15
 */
@SpringBootApplication(scanBasePackages = "com.weiyu")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.weiyu")
@EnableHystrix//添加此项才可以使用hystrix-dashboard的monitor
@EnableHystrixDashboard
public class CloudFeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudFeignApplication.class,args);
    }
}

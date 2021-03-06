package willem.weiyu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author weiyu005
 * @description
 * @create 2017/6/15
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
/**添加此项才可以使用hystrix-dashboard的monitor*/
@EnableHystrix
public class CloudFeignClient {
    public static void main(String[] args) {
        SpringApplication.run(CloudFeignClient.class,args);
    }
}

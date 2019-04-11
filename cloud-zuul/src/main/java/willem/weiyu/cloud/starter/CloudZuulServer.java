package willem.weiyu.cloud.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication(scanBasePackages = "willem.weiyu.cloud")
@EnableZuulProxy
@EnableEurekaClient
public class CloudZuulServer {

	public static void main(String[] args) {
		SpringApplication.run(CloudZuulServer.class, args);
	}
}

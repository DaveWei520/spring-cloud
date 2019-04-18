package willem.weiyu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

import willem.weiyu.cloud.stream.GreetingStream;

/**
 * @Author weiyu
 * @Description
 * @Date 2019/4/15 16:05
 */
@SpringBootApplication
public class CloudStreamServer {

    public static void main(String[] args) {
        SpringApplication.run(CloudStreamServer.class, args);
    }
}

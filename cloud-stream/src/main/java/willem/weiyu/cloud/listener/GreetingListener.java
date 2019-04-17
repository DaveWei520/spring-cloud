package willem.weiyu.cloud.listener;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;
import willem.weiyu.cloud.bean.Greeting;
import willem.weiyu.cloud.stream.GreetingStream;

/**
 * @Author weiyu
 * @Description
 * @Date 2019/4/17 12:39
 */
@Component
@Slf4j
public class GreetingListener {

    @StreamListener(GreetingStream.INPUT)
    public void handleGreeting(@Payload Greeting greeting){
        log.info("received message:{}",greeting);
    }
}

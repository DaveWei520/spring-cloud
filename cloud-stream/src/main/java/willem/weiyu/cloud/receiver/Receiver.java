package willem.weiyu.cloud.receiver;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

import lombok.extern.slf4j.Slf4j;
import willem.weiyu.cloud.bean.Greeting;
import willem.weiyu.cloud.stream.GreetingStream;

/**
 * @Author weiyu005
 * @Description
 * @Date 2019/4/18 16:48
 */
@EnableBinding(GreetingStream.class)
@Slf4j
public class Receiver {

    @StreamListener(GreetingStream.INPUT)
    public void receive(Greeting greeting){
        log.info("received message:{}", greeting);
    }
}

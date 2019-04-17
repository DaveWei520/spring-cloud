package willem.weiyu.cloud.service;

import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;

import willem.weiyu.cloud.bean.Greeting;
import willem.weiyu.cloud.stream.GreetingStream;

/**
 * @Author weiyu
 * @Description
 * @Date 2019/4/17 12:29
 */
@Service
public class GreetingService {

    private final GreetingStream greetingStream;

    public GreetingService(GreetingStream greetingStream){
        this.greetingStream = greetingStream;
    }

    public void sendMessage(Greeting greeting){
        MessageChannel messageChannel = greetingStream.out();
        messageChannel.send(MessageBuilder
                .withPayload(greeting)
                .setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON)
                .build());
    }
}

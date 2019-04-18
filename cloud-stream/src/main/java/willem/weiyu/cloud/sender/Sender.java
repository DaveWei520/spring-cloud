package willem.weiyu.cloud.sender;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;
import org.springframework.util.MimeTypeUtils;

import willem.weiyu.cloud.bean.Greeting;
import willem.weiyu.cloud.stream.GreetingStream;

/**
 * @Author weiyu
 * @Description
 * @Date 2019/4/18 16:54
 */
@Component
public class Sender {

    private final GreetingStream greetingStream;

    public Sender(GreetingStream greetingStream){
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

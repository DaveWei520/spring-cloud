package willem.weiyu.cloud.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * @Author weiyu
 * @Description
 * @Date 2019/4/17 12:22
 */
public interface GreetingStream {
    String INPUT = "greeting-in";
    String OUTPUT = "greeting-out";

    @Input(INPUT)
    SubscribableChannel in();

    @Output(OUTPUT)
    MessageChannel out();
}

package willem.weiyu.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;
import willem.weiyu.cloud.bean.Greeting;
import willem.weiyu.cloud.service.GreetingService;

/**
 * @Author weiyu
 * @Description
 * @Date 2019/4/17 12:35
 */
@RestController
@RequestMapping("/greeting")
public class GreetingController {
    @Autowired
    private GreetingService greetingService;

    @GetMapping("/hi")
    public Mono<Void> hi(String message){
        Greeting greeting = Greeting.builder().message(message).timestamp(System.currentTimeMillis()).build();
        greetingService.sendMessage(greeting);
        return Mono.empty();
    }
}

package willem.weiyu.cloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

/**
 * @Author weiyu005
 * @Description
 * @Date 2019/4/11 11:06
 */
@RestController
@RequestMapping("/index")
public class IndexController {

    @GetMapping("/hi/{message}")
    public Mono<String> sayHello(@PathVariable("message") String message){
        return Mono.just("indexController receive:"+message);
    }
}

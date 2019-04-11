package willem.weiyu.cloud.controller;

import reactor.core.publisher.Mono;
import willem.weiyu.cloud.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author weiyu
 * @description
 * @create 2017/6/15
 */
@RestController
@RequestMapping("/index")
public class IndexController {
    @Autowired
    private IndexService indexService;

    @GetMapping(value = "/hello/{message}")
    public Mono<String> hello(@PathVariable("message") String message){
        return Mono.just(indexService.hello(message));
    }

    @GetMapping(value = "/feign")
    public Mono<String> feign(){
        return Mono.just("this is feign");
    }
}

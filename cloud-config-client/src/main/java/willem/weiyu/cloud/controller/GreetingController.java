package willem.weiyu.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author weiyu@gomeholdings.com
 * @description
 * @create 2017/6/16
 */
@RestController
@RefreshScope//将次标签使用在需要刷新处
public class GreetingController {
    @Value("${message:World!}")
    private String message;

    @RequestMapping("/hi")
    public String hello() {
        return "Hello, " + message + "!";
    }
}

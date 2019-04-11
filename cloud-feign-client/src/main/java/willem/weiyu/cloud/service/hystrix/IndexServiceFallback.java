package willem.weiyu.cloud.service.hystrix;

import willem.weiyu.cloud.service.IndexService;
import org.springframework.stereotype.Component;

/**
 * @author weiyu
 * @description
 * @create 2017/6/15
 */
@Component
public class IndexServiceFallback implements IndexService {
    @Override
    public String hello(String message) {
        return "sorry,this is a mistake,can not resolve message:"+message;
    }
}

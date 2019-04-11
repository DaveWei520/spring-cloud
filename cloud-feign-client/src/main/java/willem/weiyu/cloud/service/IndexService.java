package willem.weiyu.cloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import willem.weiyu.cloud.service.hystrix.IndexServiceFallback;

/**
 * @author weiyu
 * @description
 * @create 2017/6/15
 */
@FeignClient(value = "cloud-service-provider",fallback = IndexServiceFallback.class)
public interface IndexService {
    @GetMapping(value = "/index/hi/{message}")
    String hello(@PathVariable("message") String message);
}

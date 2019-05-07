package willem.weiyu.cloud.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.eureka.server.event.*;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.netflix.appinfo.InstanceInfo;

import lombok.extern.slf4j.Slf4j;

/**
 * @author weiyu
 * @description 监听事件相关行为
 * @create 2018/5/25
 */
@Component
@Slf4j
public class EurekaStateListener {
    
    @EventListener
    public void listen(EurekaInstanceCanceledEvent event) {
        //服务下线事件
    }

    @EventListener
    public void listen(EurekaInstanceRegisteredEvent event) {
        //服务注册事件
    }

    @EventListener
    public void listen(EurekaInstanceRenewedEvent event) {
        //服务续约事件
    }

    @EventListener
    public void listen(EurekaRegistryAvailableEvent event) {
        //注册中心启动事件
    }

    @EventListener
    public void listen(EurekaServerStartedEvent event) {
        //Eureka Server启动事件
    }
}

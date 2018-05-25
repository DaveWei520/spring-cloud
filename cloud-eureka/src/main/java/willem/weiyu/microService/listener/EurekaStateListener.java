package willem.weiyu.microService.listener;

import org.springframework.cloud.netflix.eureka.server.event.*;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EurekaStateListener {

    @EventListener
    public void listen(EurekaInstanceCanceledEvent event) {
        //服务断线事件
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

    }

    @EventListener
    public void listen(EurekaServerStartedEvent event) {
        //Server启动
    }
}

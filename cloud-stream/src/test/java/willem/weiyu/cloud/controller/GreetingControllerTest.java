package willem.weiyu.cloud.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;

/**
 * @Author weiyu
 * @Description
 * @Date 2019/4/17 15:21
 */
@RunWith(SpringRunner.class)
@WebFluxTest(controllers = GreetingController.class)
public class GreetingControllerTest {
    @Autowired
    WebTestClient testClient;

    @Test
    public void testHi(){
        testClient.get().uri("/").exchange().expectStatus().isOk();
    }
}

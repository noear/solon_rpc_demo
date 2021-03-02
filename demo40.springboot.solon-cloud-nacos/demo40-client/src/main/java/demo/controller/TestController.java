package demo.controller;

import demo.protocol.HelloService;
import org.noear.nami.annotation.NamiClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author noear 2020/12/28 created
 */
@RestController
public class TestController {
    //这是远程的
    @NamiClient
    HelloService helloService2;

    @RequestMapping("/test")
    public String home(String msg) throws Exception {
        return helloService2.hello("noear");
    }
}

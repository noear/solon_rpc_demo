package demo.controller;

import demo.protocol.HelloService;
import org.noear.nami.annotation.NamiClient;
import org.noear.solon.Solon;
import org.noear.solon.annotation.Controller;
import org.noear.solon.annotation.Inject;
import org.noear.solon.annotation.Mapping;
import org.noear.solon.cloud.annotation.CloudConfig;

/**
 * @author noear 2020/12/28 created
 */
@Controller
public class TestController {
    @CloudConfig("water_cache_header")
    String water_cache_header;

    //这是本地的
    @Inject
    HelloService helloService;

    //这是远程的
    @NamiClient
    HelloService helloService2;

    @Mapping("/test")
    public String home(String msg) throws Exception {
        helloService.hello();
        String temp = helloService2.hello();

        return temp + "," + Solon.cfg().get("db1.url");
    }
}

package demo.controller;

import demo.protocol.HelloService;
import org.noear.nami.annotation.NamiClient;
import org.noear.solon.Solon;
import org.noear.solon.cloud.annotation.CloudConfig;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author noear 2020/12/28 created
 */
@RestController
public class TestController2 {
    //注：非单例，不需要加autoRefreshed
    @CloudConfig(value = "water_cache_header", autoRefreshed = true)
    String water_cache_header;

    //这是本地的
    @Resource
    HelloService helloService;

    //这是远程的
    @NamiClient
    HelloService helloService2;

    @RequestMapping("/test2")
    public String home(String msg) throws Exception {
        System.out.println(water_cache_header);

        helloService.hello();
        String temp = helloService2.hello();

        return temp + "," + Solon.cfg().get("db1.url");
    }
}

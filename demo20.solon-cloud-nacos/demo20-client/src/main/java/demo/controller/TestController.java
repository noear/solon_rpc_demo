package demo.controller;

import demo.protocol.HelloService;
import org.noear.nami.annotation.NamiClient;
import org.noear.solon.annotation.Controller;
import org.noear.solon.annotation.Inject;
import org.noear.solon.annotation.Mapping;
import org.noear.solon.cloud.annotation.CloudConfig;

/**
 * 这是Solon的控制器（基于Solon Bean 容器运行）；可以跳过
 *
 * @author noear 2020/12/28 created
 */
@Controller
public class TestController {
    @CloudConfig("water_cache_header")
    String water_cache_header;

    //这是本地的
    @Inject
    HelloService helloService;

    //这是远程的（改成：CloudClient，会不会显得跟 CloudConfig 更配套?）
    @NamiClient
    HelloService helloService2;

    @Mapping("/test")
    public String home(String msg) throws Exception {
        helloService.hello();
        String temp = helloService2.hello();

        return temp;

//        if (Utils.isNotEmpty(msg)) {
//            WaterClient.Message.sendMessage("test.hello", "test2-" + msg);
//            return "OK: *" + WaterClient.waterTraceId() + "-" + water_cache_header;
//        } else {
//            return "NO: " + helloService2.hello();
//        }
    }
}

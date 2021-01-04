package demo.client;

import demo.HelloService;
import org.noear.nami.annotation.NamiClient;
import org.noear.solon.annotation.Component;

/**
 * @author noear 2021/1/5 created
 */
@Component
public class DemoA {
    //使用固定负载器 //适用于快速演示或调试
    @NamiClient(upstream = "http://localhost:8080")
    HelloService helloService;

    public void test() {
        String result = helloService.hello("noear");
        System.out.println("Rpc result: " + result);
    }
}

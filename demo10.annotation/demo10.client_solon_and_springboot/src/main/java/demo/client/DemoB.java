package demo.client;

import demo.HelloService;
import org.noear.nami.annotation.NamiClient;
import org.noear.solon.annotation.Component;

/**
 * 使用 Solon 类注解
 *
 * @author noear 2021/1/5 created
 */
@Component
public class DemoB {
    //使用动态负载器 //适用于对接发现服务或者配置
    @NamiClient(name = "local")
    HelloService helloService;

    public void test() {
        String result = helloService.hello("noear");
        System.out.println("Rpc result: " + result);
    }
}

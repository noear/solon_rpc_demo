package demo.client;

import demo.HelloService;
import org.noear.nami.NamiAttachment;
import org.noear.nami.annotation.NamiClient;
import org.noear.solon.annotation.Component;

/**
 * @author noear 2021/1/5 created
 */
@Component
public class DemoB {
    //使用动态负载器 //适用于对接发现服务或者配置
    @NamiClient(name = "local")
    HelloService helloService;

    public void test() {
        //添加附件
        NamiAttachment.put("Token","41cb2e48-d087-4f1a-b3e6-232f2f34ca73");

        String result = helloService.hello("noear");
        System.out.println("Rpc result: " + result);
    }
}

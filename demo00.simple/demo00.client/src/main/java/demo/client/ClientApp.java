package demo.client;

import demo.HelloService;
import org.noear.nami.Nami;
import org.noear.solon.Solon;

/**
 * @author noear 2021/1/3 created
 */
public class ClientApp {
    public static void main(String[] args) {
        Solon.start(ClientApp.class, args);

        //
        // 默认使用json解码
        //
        HelloService helloService = Nami.builder()
                .upstream(() -> "http://localhost:8080").create(HelloService.class);

        String result = helloService.hello("noear");
        System.out.println("Rpc result: " + result);
    }
}
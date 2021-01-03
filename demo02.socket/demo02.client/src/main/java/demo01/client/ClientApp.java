package demo01.client;

import demo01.HelloService;
import org.noear.nami.Nami;
import org.noear.solon.Solon;

/**
 * @author noear 2021/1/3 created
 */
public class ClientApp {
    public static void main(String[] args) {
        Solon.start(ClientApp.class, args);

        HelloService helloService = Nami.builder()
                .upstream(() -> "tcp://localhost:28080").create(HelloService.class);

        String result = helloService.hello("noear");
        System.out.println("Rpc result: " + result);
    }
}
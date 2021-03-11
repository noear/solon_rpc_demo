package demo.client;

import demo.HelloService;
import org.noear.nami.Nami;
import org.noear.solon.Solon;

/**
 * @author noear 2021/1/3 created
 */
public class ClientApp {
    public static void main(String[] args) {
        //
        //solon-rpc 包里有 http boot 能力；此demo 不需要，所以app.enableHttp(false)
        //
        Solon.start(ClientApp.class, args, app -> app.enableHttp(false));

        //
        // 手动构建Rpc Client；默认使用json解码
        //
        HelloService helloService = Nami.builder()
                .upstream(() -> "http://localhost:8080")
                .path("/")
                .create(HelloService.class);

        String result = helloService.hello("noear");
        System.out.println("Rpc result: " + result);
    }
}
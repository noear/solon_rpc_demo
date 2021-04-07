package demo.client;

import demo.HelloService;
import org.noear.nami.Nami;
import org.noear.nami.annotation.NamiClient;
import org.noear.solon.Solon;

/**
 * @author noear 2021/1/3 created
 */
@NamiClient(name = "demoapi1", path = "/v2/")
public class ClientApp {

    public static void main(String[] args) {
        Solon.start(ClientApp.class, args);

        //
        // 默认使用json解码
        //
        test("demoapi1", null);  //注解可用：@NamiClient(name = "demoapi1")
        test("demoapi2", null);   //注解可用：@NamiClient(name = "demoapi2")

        test("demoapi1", "/v2/"); //注解可用：@NamiClient(name = "demoapi1", path = "/v2/")
        test("demoapi2", "/v2/"); //注解可用：@NamiClient(name = "demoapi1", path = "/v2/")
    }

    private static void test(String service, String path) {
        HelloService helloService = Nami.builder()
                .name(service)
                .path(path).create(HelloService.class);

        String result = helloService.hello("noear");
        System.out.println("Rpc @" + service + " result: " + result);
    }
}
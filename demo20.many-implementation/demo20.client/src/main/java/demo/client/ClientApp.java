package demo.client;

import demo.HelloService;
import org.noear.nami.Nami;
import org.noear.nami.annotation.NamiClient;
import org.noear.solon.Solon;
import org.noear.solon.cloud.CloudClient;
import org.noear.solon.core.LoadBalance;

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
        test("demoapi1", null);   //注解可用：@NamiClient(name = "demoapi1")
        test("demoapi2", null);   //注解可用：@NamiClient(name = "demoapi2")

        test("demoapi1", "/v2/"); //注解可用：@NamiClient(name = "demoapi1", path = "/v2/")
        test("demoapi2", "/v2/"); //注解可用：@NamiClient(name = "demoapi1", path = "/v2/")
    }

    private static void test(String service, String path) {
        LoadBalance lb = LoadBalance.get(service);

        HelloService helloService = Nami.builder()
                .upstream(lb::getServer)
                .path(path).create(HelloService.class);

        if (path == null) {
            path = "/";
        }

        String result = helloService.hello("noear");
        System.out.println("Rpc @" + service + path + " result: " + result);
    }
}
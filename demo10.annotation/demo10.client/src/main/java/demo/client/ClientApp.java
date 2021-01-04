package demo.client;

import org.noear.nami.annotation.EnableNamiClient;
import org.noear.solon.Solon;
import org.noear.solon.core.Aop;

/**
 * @author noear 2021/1/3 created
 */
@EnableNamiClient
public class ClientApp {
    public static void main(String[] args) {
        //
        //solon-rpc 包里有 http boot 能力；此demo 不需要，所以app.enableHttp(false)
        //
        Solon.start(ClientApp.class, args, app->app.enableHttp(false));

        DemoA demoA = Aop.get(DemoA.class);
        demoA.test();

        DemoB demoB = Aop.get(DemoB.class);
        demoB.test();
    }
}
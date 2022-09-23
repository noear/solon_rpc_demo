package demo.client;

import org.noear.solon.Solon;
import org.noear.solon.core.Aop;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author noear 2021/1/3 created
 */
@SpringBootApplication
public class ClientApp {
    public static void main(String[] args) {
        //
        //solon-rpc 包里有 http boot 能力；此demo 不需要，所以app.enableHttp(false)
        //
        SpringApplication.run(ClientApp.class, args);

        DemoA demoA = Solon.context().getBean(DemoA.class);
        demoA.test();

        DemoB demoB = Solon.context().getBean(DemoB.class);
        demoB.test();
    }
}
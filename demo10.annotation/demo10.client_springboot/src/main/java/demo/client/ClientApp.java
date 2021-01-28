package demo.client;

import org.noear.nami.integration.springboot.EnableNamiClients;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author noear 2021/1/3 created
 */
@EnableNamiClients
@SpringBootApplication
public class ClientApp {
    public static void main(String[] args) {
        //
        //solon-rpc 包里有 http boot 能力；此demo 不需要，所以app.enableHttp(false)
        //
        ApplicationContext ctx = SpringApplication.run(ClientApp.class, args);

        DemoA demoA = ctx.getBean(DemoA.class);
        demoA.test();

        DemoB demoB = ctx.getBean(DemoB.class);
        demoB.test();
    }
}
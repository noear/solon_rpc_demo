package demo.client;

import org.noear.solon.core.Aop;
import org.noear.solon.extend.springboot.EnableSolon;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author noear 2021/1/3 created
 */
@EnableSolon
@SpringBootApplication
public class ClientApp {
    public static void main(String[] args) {
        //
        //solon-rpc 包里有 http boot 能力；此demo 不需要，所以app.enableHttp(false)
        //
        SpringApplication.run(ClientApp.class, args);

        DemoA demoA = Aop.get(DemoA.class);
        demoA.test();

        DemoB demoB = Aop.get(DemoB.class);
        demoB.test();
    }
}
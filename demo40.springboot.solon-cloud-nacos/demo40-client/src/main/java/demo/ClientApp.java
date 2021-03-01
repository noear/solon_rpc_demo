package demo;

import org.noear.nami.integration.springboot.EnableNamiClients;
import org.noear.solon.cloud.integration.springboot.EnableCloud;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author noear 2020/12/28 created
 */
@EnableCloud
@EnableNamiClients
@SpringBootApplication
public class ClientApp {
    public static void main(String[] args) {
        //
        // 先运行：demo40-server，再运行 demo40-client
        // 然后打开：http://localhost:8080/test 试试
        //
        SpringApplication.run(ClientApp.class, args);
    }
}

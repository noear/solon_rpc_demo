package demo;

import lombok.extern.slf4j.Slf4j;
import org.noear.solon.Solon;

/**
 * @author noear 2020/12/28 created
 */
@Slf4j
public class ClientApp {
    public static void main(String[] args) {
        Solon.start(ClientApp.class, args);

        log.info("系统启动了...");
    }
}

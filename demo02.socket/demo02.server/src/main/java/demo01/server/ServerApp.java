package demo01.server;

import org.noear.solon.Solon;

/**
 * @author noear 2021/1/3 created
 */
public class ServerApp {
    public static void main(String[] args) {
        Solon.start(ServerApp.class, args);
    }
}

package demo.server;

import org.noear.solon.Solon;
import org.noear.solon.SolonApp;

/**
 * @author noear 2021/1/3 created
 */
public class ServerApp {
    public static void main(String[] args) {
        SolonApp app = Solon.start(ServerApp.class, args);

        //
        // 手动添加Rpc服务（注意 remoting 属性，设为 true 即是 rpc service）
        //
        app.add("/", HelloServiceImpl.class, true);
    }
}

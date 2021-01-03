package demo.client;

import demo.HelloService;
import org.noear.nami.Nami;
import org.noear.nami.coder.hession.HessianDecoder;
import org.noear.solon.Solon;

/**
 * @author noear 2021/1/3 created
 */
public class ClientApp {
    public static void main(String[] args) {
        Solon.start(ClientApp.class, args);

        HelloService rpc = null;
        String result = null;

        // 默认使用json解码
        //
        rpc = Nami.builder().upstream(() -> "tcp://localhost:28080").create(HelloService.class);

        result = rpc.hello("noear");
        System.out.println("Rpc result: " + result);

        // 使用hessian解码
        //
        rpc = Nami.builder().upstream(() -> "tcp://localhost:28080").decoder(HessianDecoder.instance).create(HelloService.class);

        result = rpc.hello("noear");
        System.out.println("Rpc result: " + result);
    }
}
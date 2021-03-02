package demo.controller;

import demo.protocol.HelloService;
import org.noear.solon.annotation.Component;
import org.noear.solon.annotation.Mapping;

/**
 * 注：这个类如果有什么注入需求，要使用 Solon 的 @Inject 解注
 *
 * @author noear 2021/1/8 created
 */
@Mapping("/rpc/")
@Component(remoting = true)
public class HelloServiceRemoteImp implements HelloService {
    @Override
    public String hello() {
        return "remote: hello";
    }
}

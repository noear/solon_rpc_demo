package demo.controller;

import demo.protocol.HelloService;
import org.noear.solon.annotation.Component;
import org.noear.solon.annotation.Mapping;
import org.noear.solon.core.handle.MethodType;

/**
 * @author noear 2021/1/8 created
 */
@Mapping(value = "/rpc/", method = MethodType.ALL)
@Component(remoting = true)
public class HelloServiceRemoteImp implements HelloService {
    @Override
    public String hello() {
        return "remote: hello";
    }
}

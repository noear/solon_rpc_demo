package demo.controller;

import demo.protocol.HelloService;
import org.noear.solon.annotation.Component;
import org.noear.solon.annotation.Mapping;

/**
 * 这个类的注解，必须使用 Solon 体系的注解注入
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

package demo.server;

import demo.HelloService;
import org.noear.solon.annotation.Component;
import org.noear.solon.annotation.Mapping;
import org.noear.solon.annotation.Remoting;

/**
 * @author noear 2021/1/3 created
 */
@Mapping("/v2/")
@Remoting
public class HelloServiceImpl2 implements HelloService {
    @Override
    public String hello(String name) {
        return "hello: " + name;
    }
}
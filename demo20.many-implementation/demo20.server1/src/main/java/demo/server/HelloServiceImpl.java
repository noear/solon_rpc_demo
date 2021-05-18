package demo.server;

import demo.HelloService;
import org.noear.solon.annotation.Component;
import org.noear.solon.annotation.Mapping;
import org.noear.solon.annotation.Remoting;

/**
 * @author noear 2021/1/3 created
 */
@Mapping("/")
@Remoting
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(String name) {
        return "hello: " + name;
    }
}
package demo.dso;

import demo.protocol.HelloService;
import org.noear.solon.annotation.Component;

/**
 * @author noear 2020/12/29 created
 */
@Component
public class HelloServiceLocalImp implements HelloService {
    @Override
    public String hello() {
        return "local: hello";
    }
}

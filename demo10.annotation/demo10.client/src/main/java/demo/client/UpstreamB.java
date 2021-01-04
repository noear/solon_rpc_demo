package demo.client;

import org.noear.solon.annotation.Component;
import org.noear.solon.core.LoadBalance;

/**
 * @author noear 2021/1/5 created
 */
@Component("local")
public class UpstreamB implements LoadBalance {
    @Override
    public String getServer() {
        return "http://localhost:8080";
    }
}

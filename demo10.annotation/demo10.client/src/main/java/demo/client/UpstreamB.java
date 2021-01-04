package demo.client;

import org.noear.solon.annotation.Component;
import org.noear.solon.core.LoadBalance;

/**
 * 定义一个负载器；可对接发现服务或者配置
 *
 * @author noear 2021/1/5 created
 */
@Component("local")
public class UpstreamB implements LoadBalance {
    @Override
    public String getServer() {
        return "http://localhost:8080";
    }
}



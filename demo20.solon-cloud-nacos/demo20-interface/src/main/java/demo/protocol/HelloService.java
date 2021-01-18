package demo.protocol;

import org.noear.nami.annotation.NamiClient;

/**
 * ::helloapi  表示后端服务名
 * ::/rpc/ 表示资源路径
 *
 * @author noear 2020/12/29 created
 */
@NamiClient("helloapi:/rpc/")
public interface HelloService {
    String hello();
}

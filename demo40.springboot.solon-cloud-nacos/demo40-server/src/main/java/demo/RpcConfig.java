package demo;

import org.noear.solon.Solon;
import org.noear.solon.annotation.Bean;
import org.noear.solon.annotation.Configuration;
import org.noear.solon.core.SignalSim;
import org.noear.solon.core.SignalType;

/**
 * @author noear 2021/3/1 created
 */
//这是Solon 的注解
@Configuration
public class RpcConfig {
    @Bean
    public void rpcReg() {
        //
        // 这个临时写一写；因为没有为Springboot简化过；之后就不需要这个处理了（之前搞忘了）
        //
        Solon.global().signalAdd(new SignalSim(Solon.cfg().appName(), Solon.global().port(), "http", SignalType.HTTP));
    }
}

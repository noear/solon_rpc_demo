package demo;

import org.noear.nami.Nami;
import org.noear.nami.NamiConfiguration;
import org.noear.nami.annotation.NamiClient;
import org.noear.nami.common.Constants;
import org.springframework.context.annotation.Configuration;

/**
 * @author noear 2021/3/2 created
 */
@Configuration
public class NamiConfigurationImpl implements NamiConfiguration {
    @Override
    public void config(NamiClient client, Nami.Builder builder) {
        builder.headerSet(Constants.HEADER_CONTENT_TYPE, Constants.CONTENT_TYPE_JSON);

        //如果要用 PROTOBUF 格式
        // >>客户端需引入：nami.coder.protostuff；
        // >>服务端需引入：solon.serialization.protostuff
//                builder.headerSet(Constants.HEADER_CONTENT_TYPE, Constants.CONTENT_TYPE_PROTOBUF);
//                builder.headerSet(Constants.HEADER_ACCEPT, Constants.CONTENT_TYPE_PROTOBUF);
    }
}

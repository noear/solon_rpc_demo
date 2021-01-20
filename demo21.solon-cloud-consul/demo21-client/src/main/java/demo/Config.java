package demo;

import com.zaxxer.hikari.HikariDataSource;
import org.noear.solon.annotation.Bean;
import org.noear.solon.annotation.Configuration;
import org.noear.solon.cloud.annotation.CloudConfig;

import javax.sql.DataSource;

/**
 * @author noear 2021/1/20 created
 */
@Configuration
public class Config {
    @Bean
    public DataSource ds(@CloudConfig("test_db") HikariDataSource ds){
        return ds;
    }
}

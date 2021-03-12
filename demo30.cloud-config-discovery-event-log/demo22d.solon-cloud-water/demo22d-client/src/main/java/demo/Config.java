package demo;

import com.zaxxer.hikari.HikariDataSource;
import org.noear.solon.annotation.Bean;
import org.noear.solon.annotation.Configuration;
import org.noear.solon.annotation.Inject;

import javax.sql.DataSource;

/**
 * @author noear 2021/1/20 created
 */
@Configuration
public class Config {
    @Bean
    public DataSource ds(@Inject("${db1}") HikariDataSource ds) {
        System.out.println(ds.getUsername() + ":" + ds.getJdbcUrl());
        return ds;
    }
}

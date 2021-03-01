package demo;

import org.noear.solon.extend.springboot.EnableSolon;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author noear 2021/1/8 created
 */
@EnableSolon
@SpringBootApplication
public class ServarApp {
    public static void main(String[] args) {
        SpringApplication.run(ServarApp.class, args);
    }
}

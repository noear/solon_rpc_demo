package demo.controller;

import org.noear.solon.annotation.Controller;
import org.noear.solon.annotation.Mapping;
import org.noear.solon.cloud.CloudClient;
import org.noear.solon.cloud.model.Event;

/**
 * @author noear 2021/1/27 created
 */
@Controller
public class TestController {
    @Mapping("/test")
    public Object test() {
        Event event = new Event("hello.demo", "demo");
        return CloudClient.event().publish(event);
    }

    @Mapping("/test2")
    public Object test2() {
        Event event = new Event("hello.demo2", "demo2");
        return CloudClient.event().publish(event);
    }
}

package demo.controller;

import org.noear.solon.cloud.CloudEventHandler;
import org.noear.solon.cloud.annotation.CloudEvent;
import org.noear.solon.cloud.model.Event;

/**
 * @author noear 2021/1/27 created
 */
@CloudEvent("hello.demo2")
public class EVENT_hello_demo2 implements CloudEventHandler {
    @Override
    public boolean handler(Event event) throws Throwable {
        System.out.println(event.content());
        return true;
    }
}

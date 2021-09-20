package demo.client.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author noear 2021/9/20 created
 */
@RestController
public class TestController {
    @RequestMapping("/test0")
    public Object test0() {
        Map<String, Object> map = new HashMap<>();
        map.put("code", 1);
        return map;
    }

    @RequestMapping("/test1")
    public String test1() {
        return "{\"code\":1}";
    }

    @RequestMapping("/test2")
    public String test2() {
        return "hello";
    }

    @RequestMapping("/test3")
    public Integer test3() {
        return 1;
    }

    @RequestMapping("/test4")
    public Object test4() {
        return null;
    }
}

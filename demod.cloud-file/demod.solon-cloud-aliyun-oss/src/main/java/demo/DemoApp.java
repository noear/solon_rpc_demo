package demo;

import org.noear.snack.ONode;
import org.noear.solon.Utils;
import org.noear.solon.cloud.CloudClient;
import org.noear.solon.core.handle.Result;

import java.io.File;

/**
 * @author noear 2021/4/8 created
 */
public class DemoApp {
    public static void main(String[] args){
        test();
        test2();
    }

    public static void test() {
        if(CloudClient.file() == null){
            System.err.println("This file service is not available");
            return;
        }

        String key = "test/" + Utils.guid();
        String val = "Hello world!";

        Result result = CloudClient.file().putString(key, val);
        System.out.println(ONode.stringify(result));
        assert result.getCode() == Result.SUCCEED_CODE;


        String tmp = CloudClient.file().getString(key);
        assert val.equals(tmp);
    }


    public static void test2() {
        if(CloudClient.file() == null){
            System.err.println("This file service is not available");
            return;
        }

        String key = "test/" + Utils.guid() + ".png";
        File val = new File(Utils.getResource("test.png").getFile());

        Result result = CloudClient.file().putFile(key, val);
        System.out.println(ONode.stringify(result));
        assert result.getCode() == Result.SUCCEED_CODE;
    }
}

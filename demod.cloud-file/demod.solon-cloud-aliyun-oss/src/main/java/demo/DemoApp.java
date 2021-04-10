package demo;

import org.noear.snack.ONode;
import org.noear.solon.Utils;
import org.noear.solon.cloud.CloudClient;
import org.noear.solon.core.handle.Result;

import java.io.File;
import java.io.FileInputStream;

/**
 * @author noear 2021/4/8 created
 */
public class DemoApp {
    public static void main(String[] args) throws Exception{
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

        //上传字符串内容
        Result result = CloudClient.file().putText(key, val);
        System.out.println(ONode.stringify(result));
        assert result.getCode() == Result.SUCCEED_CODE;


        //获取字符串内容
        String tmp = CloudClient.file().getText(key);
        assert val.equals(tmp);
    }


    public static void test2() throws Exception{
        if(CloudClient.file() == null){
            System.err.println("This file service is not available");
            return;
        }

        String key = "test/" + Utils.guid() + ".png";
        File val = new File(Utils.getResource("test.png").getFile());

        //上传文件
        Result result = CloudClient.file().putStream(key, new FileInputStream(val), Utils.mime(val.getName()));
        System.out.println(ONode.stringify(result));
        assert result.getCode() == Result.SUCCEED_CODE;
    }
}

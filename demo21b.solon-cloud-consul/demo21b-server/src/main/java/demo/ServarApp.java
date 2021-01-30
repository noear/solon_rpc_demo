package demo;

import org.noear.solon.Solon;

/**
 * @author noear 2021/1/8 created
 */
public class ServarApp {
    public static void main(String[] args) {
        Solon.start(ServarApp.class, args, app->app.enableSocketD(true));
    }
}

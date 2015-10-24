package garndesh.hbs_main;

/**
 * Created by cte20616 on 20-10-2015.
 */
public class ServerMain {

    public static void main(String[] args) throws Exception {
        int port;
        if (args.length > 0) {
            port = Integer.parseInt(args[0]);
        } else {
            port = 8080;
        }
        new NettyDiscardTest(port).run();
    }
}

package creational.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author linexsong
 */
public class LoadBalancer {
    /**
     * 私有静态成员变量，存储唯一实例
     */
    private static LoadBalancer balancer;

    /**
     * 服务器集合
     */
    private final List<String> servers;

    private LoadBalancer() {
        servers = new ArrayList<>();
    }

    public static LoadBalancer getLoadbalancer() {
        if (balancer == null) {
            balancer = new LoadBalancer();
        }
        return balancer;
    }

    public void addServer(String server) {
        servers.add(server);
    }

    public String getServer() {
        return servers.get(new Random().nextInt(servers.size()));
    }
}

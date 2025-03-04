package creational.singleton;

/**
 * @author linexsong
 */
public class Client {
    public static void main(String[] args) {
        LoadBalancer balancer = LoadBalancer.getLoadbalancer();
        balancer.addServer("服务器1");
        balancer.addServer("服务器2");
        balancer.addServer("服务器3");
        System.out.println(balancer.getServer());
    }
}

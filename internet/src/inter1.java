import java.net.InetAddress;
import java.net.UnknownHostException;

public class inter1 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress ip = InetAddress.getLocalHost();
        System.out.println(ip);
        InetAddress host = InetAddress.getByName("LAPTOP-HHHCCGHN");
        System.out.println(host);
        InetAddress ip1 = InetAddress.getByName("www.baidu.com");
        System.out.println(ip1);
        String host0 = ip1.getHostAddress();
        System.out.println(host0);
        String host1 = ip1.getHostName();
        System.out.println(host1);
    }
}

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class udp2 {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(9999);
        byte[] buf = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buf,buf.length);
        System.out.println("接收端等待接收");
        datagramSocket.receive(packet);
        int length = packet.getLength();
        byte[] data = packet.getData();
        String s = new String(data,0,length);
        System.out.println(s);
        datagramSocket.close();
    }
}

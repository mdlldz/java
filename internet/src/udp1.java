import java.io.IOException;
import java.net.*;

public class udp1 {
    public static void main(String[] args) throws SocketException, UnknownHostException {
        DatagramSocket socket = new DatagramSocket(9998);
        byte[] data = "hi,mdl".getBytes();
        DatagramPacket packet = new DatagramPacket(data,data.length, InetAddress.getByName("192.168.2.57"),9999);
        try {
            socket.send(packet);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        socket.close();
    }
}

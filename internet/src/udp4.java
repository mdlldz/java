import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class udp4 {
    public static void main(String[] args) throws IOException {
            DatagramSocket socket = new DatagramSocket();
            String data = "四大名著是哪些";
            byte[] sendData = data.getBytes();
            DatagramPacket packet = new DatagramPacket(sendData, sendData.length,
                    InetAddress.getLocalHost(), 8888);
            socket.send(packet);
            byte[] buf = new byte[1024];
            DatagramPacket receivePacket = new DatagramPacket(buf, buf.length);
            socket.receive(receivePacket);
            String reply = new String(receivePacket.getData(), 0, receivePacket.getLength());
            System.out.println(reply);
            socket.close();
        }
    }

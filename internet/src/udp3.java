import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class udp3 {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(8888);
        byte[] buf = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buf, buf.length);
        socket.receive(packet);
        String content = new String(packet.getData(), 0, packet.getLength());
        String reply;
        if ("四大名著是哪些".equals(content)) {
            reply = "四大名著是<<红楼梦>>、<<西游记>>、<<水浒传>>、<<三国演义>>";
        } else {
            reply = "what?";
        }
        byte[] replyData = reply.getBytes();
        DatagramPacket replyPacket = new DatagramPacket(replyData, replyData.length,
                packet.getAddress(), packet.getPort());
        socket.send(replyPacket);
        socket.close();
    }}


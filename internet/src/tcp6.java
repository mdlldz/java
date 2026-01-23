import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class tcp6 {
    public static void main(String[] args) throws Exception {
        ServerSocket serversocket = new ServerSocket(8888);
        System.out.println("等待连接");
        Socket socket = serversocket.accept();
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        byte [] b = streamToByteArray(bis);
        String path = "D:\\b.jpg";
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(path));
        bos.write(b);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write("收到图片");
        bw.flush();
        socket.shutdownOutput();
        bos.close();
        bis.close();
        bw.close();
        socket.close();
        serversocket.close();
    }
    public static byte[] streamToByteArray(InputStream is) throws Exception{
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] b = new byte[1024];
        int len;
        while((len=is.read(b))!=-1){
            bos.write(b, 0, len);
        }
        byte[] array = bos.toByteArray();
        bos.close();
        return array;
    }
}

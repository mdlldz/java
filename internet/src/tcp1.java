import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class tcp1 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("等待连接");
        Socket socket = serverSocket.accept();
        InputStream is  = socket.getInputStream();
        byte [] buf = new byte [1024];
        int len;
        while((len = is.read(buf)) != -1){
            System.out.println(new String(buf,0,len));
        }
        OutputStream os = socket.getOutputStream();
        os.write("hello".getBytes());
        socket.shutdownOutput();
        is.close();
        os.close();
        socket.close();
        serverSocket.close();
    }
}

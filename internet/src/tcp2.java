import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class tcp2 {
    public static void main(String[] args) throws IOException {
            Socket socket = new Socket("localhost", 9999);
            OutputStream os = socket.getOutputStream();
            os.write("hello".getBytes());
            socket.shutdownOutput();
            InputStream is = socket.getInputStream();
             byte [] buf = new byte [1024];
             int len;
            while((len = is.read(buf)) != -1){
            System.out.println(new String(buf,0,len));
            }
            os.close();
            is.close();
            socket.close();
    }
}

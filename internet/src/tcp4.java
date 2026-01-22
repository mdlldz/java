import java.io.*;
import java.net.Socket;

public class tcp4 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 9999);
        BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
       bw.write("hello,字符流");
       bw.newLine();
       bw.flush();
       socket.shutdownOutput();
       BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        System.out.println(br.readLine());
       br.close();
       bw.close();
        socket.close();
    }
}

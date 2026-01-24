import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class tcp7 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("等待连接");
        Socket socket = serverSocket.accept();
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String s = null;
        while ((s = br.readLine()) != null) {
            System.out.println(s);
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write("mdl");
        bw.newLine();
        bw.flush();
        socket.shutdownOutput();
        bw.close();
        br.close();
        socket.close();
        serverSocket.close();
    }
}

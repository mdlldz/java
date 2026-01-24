import java.io.*;
import java.net.Socket;
public class tcp8 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost" , 9999);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write("name");
        bw.newLine();
        bw.flush();
        socket.shutdownOutput();
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String s = null;
        while ((s = br.readLine()) != null) {
            System.out.println(s);
        }
        bw.close();
        socket.close();
    }
}

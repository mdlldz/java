import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class tcp5 {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket( InetAddress.getLocalHost(),8888);
        String path  =  "D:\\a.jpg.png";
        BufferedInputStream bi = new BufferedInputStream(new FileInputStream(path));
         byte [] bytes = streamToByteArray(bi);
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        bos.write(bytes);
        bos.flush();
        socket.shutdownOutput();
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String str = null;
        while ((str = br.readLine()) != null) {
            System.out.println(str);
        }
        bi.close();
        bos.close();
        br.close();
        socket.close();
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

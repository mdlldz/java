import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class tcp10 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入文件名");
        String filename = input.next();
        Socket socket = new Socket(InetAddress.getLocalHost(),9999);
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        bos.write(filename.getBytes());
        bos.flush();
        socket.shutdownOutput();
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        byte [] buffer = streamToByteArray(bis);
        String str = "D:\\a\\" + filename + ".txt";
        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(str));
        out.write(buffer);
        out.flush();
        bos.close();
        bis.close();
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

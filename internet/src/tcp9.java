import javax.jnlp.FileContents;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class tcp9 {
    public static void main(String[] args) throws Exception {
         ServerSocket serverSocket = new ServerSocket(9999);
         Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        byte[] b = new byte[1024];
        int len = inputStream.read(b);
        String downLoadFileName = new String(b, 0, len).trim();
        System.out.println("客户端希望下载文件名=" + downLoadFileName);
        String resFileName;
        if("mdl".equals(downLoadFileName)){
            resFileName = "D:\\mdl.txt";
        }
        else{
            resFileName = "D:\\ldz.txt";
        }
       BufferedInputStream bis = new BufferedInputStream(new FileInputStream(resFileName));
        byte[] bytes = streamToByteArray(bis);
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        bos.write(bytes);
        bos.flush();
        socket.shutdownOutput();
        bos.close();
        bis.close();
        inputStream.close();
        socket.close();
        serverSocket.close();
        };
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

import java.io.*;

public class file14 {
    public static void main(String[] args) throws IOException {
     String path = "D:\\a.txt";
     InputStreamReader isr = new InputStreamReader(new FileInputStream(path),"gbk");
     BufferedReader br = new BufferedReader(isr);
     String s = br.readLine();
        System.out.println(s);
        br.close();
    }
}

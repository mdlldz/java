import java.io.*;
import java.util.Properties;

public class file17 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src\\mysql.properties"));
        String line = null;
        while((line = br.readLine()) != null){
            String [] split = line.split("=");
            System.out.println(split[0] + " " + split[1]);
        }
        br.close();
        Properties p = new Properties();
        p.setProperty("charset", "utf-8");
        p.setProperty("user", "汤姆");
        p.setProperty("pwd", "abc111");
        p.store(new FileOutputStream("src\\mysql.properties"), null);
        p.load(new FileReader("src\\mysql.properties"));
        p.list(System.out);
        String user = p.getProperty("user");
        String pwd = p.getProperty("pwd");
        String ip = p.getProperty("ip");
        System.out.println("user: " + user + " password: " + pwd + " ip: " + ip);
    }
}

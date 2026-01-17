import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class file5 {
    public static void main(String[] args) {

    }
    public void m0(){
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("D:\\Koala.jpg");
            fos = new FileOutputStream("src\\koala.jpg");
            byte[] b = new byte[1024];
            int len;
            while((len = fis.read(b)) != -1) {
                fos.write(b, 0, len);
            }
            System.out.println("ok~~");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fos != null)
                    fos.close();
                if (fis != null)
                    fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

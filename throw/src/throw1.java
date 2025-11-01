import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class throw1 {
    public void f1() throws FileNotFoundException{
        f2();
    }
    public void f2() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("d://aa.txt");
    }
}
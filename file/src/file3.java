import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class file3 {
    @Test
    public void readFile1() throws IOException {
        String filepath = "D:\\helloworld.txt";
        int readLen = 0;
        byte [] buf = new byte[8];
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(filepath);
            while((readLen = fileInputStream.read(buf)) != -1){
                System.out.print(new String(buf,0,readLen));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        finally {
            fileInputStream.close();
        }
    }
}

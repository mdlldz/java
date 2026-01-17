import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class file4 {
    public static void main(String[] args) {
    }
    @Test
    public void writeFile() throws IOException {
        String filepath = "D:\\a.txt";
        FileOutputStream fileOutputStream = null;
        String str = "mdl";

        try {
            fileOutputStream = new FileOutputStream(filepath, true);
            fileOutputStream.write(str.getBytes(),0,2);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

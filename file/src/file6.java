import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class file6 {
    public static void main(String[] args) throws IOException {
        String filepath = "D:\\story.txt";
        char[] chars = new char[8];
        int len = 0;
       FileReader fileReader = null;
        try {
             fileReader = new FileReader(filepath);
            while((len = fileReader.read(chars)) != -1){
                System.out.println(new String(chars, 0, len));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        finally {
            fileReader.close();
        }
    }
}
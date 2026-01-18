import java.io.FileWriter;
import java.io.IOException;

public class file7 {
    public static void main(String[] args) throws IOException {
        String path = "D:\\note.txt";
        FileWriter fileWriter = null;
        char[] chars = { 'a', 'b', 'c', 'd', 'e' };
        try {
            fileWriter = new FileWriter(path);
            fileWriter.write('H');
            fileWriter.write(chars);
            fileWriter.write("mdlldz".toCharArray(),0,3);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            fileWriter.flush();
//                fileWriter.close();
        }
    }
}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class file10 {
    public static void main(String[] args) throws IOException {
        String path = "D:\\b.txt";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path,true));
        bufferedWriter.write("mdl1");
        bufferedWriter.newLine();
        bufferedWriter.write("mdl2");
        bufferedWriter.newLine();
        bufferedWriter.write("mdl3");
        bufferedWriter.newLine();
        bufferedWriter.close();
    }
}

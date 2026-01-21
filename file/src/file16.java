import java.io.IOException;
import java.io.PrintStream;
import java.sql.SQLOutput;

public class file16 {
    public static void main(String[] args) throws IOException, InterruptedException {
        PrintStream out = System.out;
        out.println("mdl");
        out.write("mdl".getBytes());
        System.setOut(new PrintStream("D:\\a.txt"));
        System.out.println("mdl");
    }
}

import java.io.*;

public class file15 {
    public static void main(String[] args) throws IOException {
        String path = "D:\\a.txt";
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(path),"gbk");
        osw.write("mdl");
        osw.close();
    }
}

import java.io.*;

public class file11 {
    public static void main(String[] args) throws IOException {
        String scrFailPath = "D:\\c.java";
        String destFailPath = "D:\\d.java";
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        String line;
        try {
            bufferedReader = new BufferedReader(new FileReader(scrFailPath));
            bufferedWriter = new BufferedWriter(new FileWriter(destFailPath));
            while((line = bufferedReader.readLine())!= null){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if(bufferedReader != null){
            bufferedReader.close();
        }
        if(bufferedWriter != null){
            bufferedWriter.close();
        }
    }
}

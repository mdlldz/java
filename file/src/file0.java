import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class file0 {
    public void main(String[] args) {

    }
@Test
    public void creat0(){
        String filePath = "D:\\news1.txt";
        File file = new File(filePath);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("文件创建成功");
    }
    @Test
    public void creat1(){
        File parentfile = new File("D:\\");
        String filename = "news2.txt";
        File file = new File(parentfile,filename);
        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    public void creat2(){
        String filePath = "D:\\";
        String filename = "news3.txt";
        File file = new File(filePath, filename);
        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {

        }
    }
}

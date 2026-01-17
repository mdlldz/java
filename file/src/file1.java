import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class file1 {
    public static void main(String[] args) {

    }

    @Test
    public void info(){
        File file = new File("D:\\news1.txt");
        System.out.println("文件名字为" + file.getName());
        System.out.println("文件绝对路径为" + file.getAbsolutePath());
        System.out.println("文件父级目录为" + file.getParent() );
        System.out.println("文件大小为" + file.length());
        System.out.println("文件是否存在" + file.exists());
        System.out.println("是不是一个文件" + file.isFile());
        System.out.println("是不是一个目录" + file.isDirectory());
    }
}

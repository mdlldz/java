import org.junit.jupiter.api.Test;

import java.io.File;

public class file2 {
    @Test
    public void m1(){
        String path = "D:\\news2.txt";
        File file = new File(path);
        if(file.exists()){
            file.delete();
            System.out.println("文件删除成功");
        }
        else{
            System.out.println("该文件不存在");
        }
    }
    @Test
    public void m2(){
        String path = "D:\\a\\b\\c\\d";
        File file = new File(path);
        if(file.exists()){
            System.out.println("该文件已存在");
        }
        else{
            file.mkdirs();
            System.out.println(path + "创建成功");

        }
    }
}

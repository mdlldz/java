package interface2;

public class MysqlDB implements DBinterface{
    public void connect(){
        System.out.println("创建mysql");
    }
    public void close(){
        System.out.println("关闭mysql");
    }
}

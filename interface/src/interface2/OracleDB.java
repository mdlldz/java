package interface2;

public class OracleDB implements DBinterface{
    public void connect(){
        System.out.println("创建oracle");
    }
    public void close(){
        System.out.println("结束oracle");
    }
}

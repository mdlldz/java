public class jdbc1 implements jdbcinterface {
    public Object getconnection(){
        System.out.println("得到mysql连接");
        return null;
    }
    @Override
    public void crud() {
        System.out.println("完成mysql增删改查");
    }
    @Override
    public void close() {}
}

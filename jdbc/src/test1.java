public class test1 {
    public static void main(String[] args) {
        jdbcinterface jdbcinterface = new jdbc1();
        jdbcinterface.getconnection();
        jdbcinterface.close();
        jdbcinterface.crud();

    }
}

package interface2;

public class Test {
    public static void main(String[] args) {
        MysqlDB mysqlDB = new MysqlDB();
        t(mysqlDB);
    }
    public static void t(DBinterface db){
        db.connect();
        db.close();
    }
}

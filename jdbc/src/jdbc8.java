import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class jdbc8 {
    public static void main(String[] args) throws SQLException {
        Connection connection = JDBCUtils.getConnection();
        String sql = "insert into admin values (null,?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        System.out.println("开始执行");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            statement.setString(1,"jack" + i);
            statement.setString(2,"666");
            statement.executeUpdate();
        }
        long end = System.currentTimeMillis();
        System.out.println("耗时=" + (end - start));
        JDBCUtils.close(null, statement, connection);
    }
public void bath() throws SQLException {
    Connection connection = JDBCUtils.getConnection();
    String sql = "insert into admin values (null,?,?)";
    PreparedStatement statement = connection.prepareStatement(sql);
    System.out.println("开始执行");
    long start = System.currentTimeMillis();
    for (int i = 0; i < 5000; i++) {
        statement.setString(1,"jack" + i);
        statement.setString(2,"666");
        statement.addBatch();
        if(i + 1 % 1000 == 0 ){
            statement.executeBatch();
            statement.clearBatch();
        }
        statement.executeUpdate();
    }
    long end = System.currentTimeMillis();
    System.out.println("耗时=" + (end - start));
    JDBCUtils.close(null, statement, connection);
    }
}

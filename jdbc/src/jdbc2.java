import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class jdbc2 {
    public static void main(String[] args) throws SQLException {
    Driver driver = new Driver();
    String url = "jdbc:mysql://localhost:3306/dp01";
    Properties info = new Properties();
    info.setProperty("user", "root");
    info.setProperty("password", "123456");
    Connection connection =driver.connect(url, info);
    String sql = "insert into actor values(null,'mdl','男', '2005-08-22','110')";
    Statement statement = connection.createStatement();
    int row = statement.executeUpdate(sql);
    System.out.println(row > 0 ? "成功":"失败");
    statement.close();
    connection.close();
    }

}

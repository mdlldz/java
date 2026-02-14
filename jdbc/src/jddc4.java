import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

public class jddc4 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入管理员名字");
        String admin_name = sc.nextLine();
        System.out.println("输入管理员密码");
        String admin_pwd = sc.nextLine();
        Properties properties = new Properties();
        properties.load(new FileInputStream("src//properties"));
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        Class.forName(driver);
        Connection connection = DriverManager.getConnection(url, user, password);
        String sql = "select name, pwd from admin where name = '"
                + admin_name + "' and pwd = '" + admin_pwd + '\'';
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        if (resultSet.next()) {
            System.out.println("登录成功");
        } else {
            System.out.println("登录失败");
        }
        statement.close();
        connection.close();
    }
}

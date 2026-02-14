import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class jbdc5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入待修改的编号: ");
        int id = input.nextInt();
        System.out.print("请输入新的姓名: ");
        String name = input.next();
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = JDBCUtils.getConnection();
            String sql = "update actor set name=? where id=?";
            statement = connection.prepareStatement(sql);
            statement.setString(1, name);
            statement.setInt(2, id);
            int update = statement.executeUpdate();
            System.out.println(update > 0 ? "修改成功！" : "修改失败！");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(null, statement, connection);
        }
    }
}

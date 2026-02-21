import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class jbdc7 {
    public static void main(String[] args) {
        Connection connection = null;
        String sql1 = "update account set balance = balance - 100 where id = 1";
        String sql2 = "update account set balance = balance + 100 where id = 2";
        PreparedStatement statement = null;
        try {
            connection = JDBCUtils.getConnection();
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(sql1);
            statement.executeUpdate();
            statement = connection.prepareStatement(sql2);
            statement.executeUpdate();
            connection.commit();
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
            throw new RuntimeException(e);
        }
    }
}

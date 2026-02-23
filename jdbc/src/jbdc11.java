import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class jbdc11 {
    private static final String URL = "jdbc:mysql://localhost:3306/your_database?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "your_password";
    private static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void main(String[] args) {
        try {
            testUpdate();
            testQuerySingle();
            testQueryMulti();
            testScalar();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void testUpdate() throws Exception {
        Connection connection = null;
        try {
            connection = getConnection();
            QueryRunner qr = new QueryRunner();
            int update = qr.update(connection, "update boys set name=? where id=1", "慕容复");
            System.out.println(update > 0 ? "success" : "failure");
        } finally {
            DbUtils.close(connection);
        }
    }

    public static void testQuerySingle() throws Exception {
        Connection connection = null;
        try {
            connection = getConnection();
            QueryRunner qr = new QueryRunner();
            Boys boys = qr.query(connection, "select * from boys where id=?", new BeanHandler<>(Boys.class), 1);
            System.out.println(boys);
        } finally {
            DbUtils.close(connection);
        }
    }

    public static void testQueryMulti() throws Exception {
        Connection connection = null;
        try {
            connection = getConnection();
            QueryRunner qr = new QueryRunner();
            List<Boys> list = qr.query(connection, "select * from boys where id>=?", new BeanListHandler<>(Boys.class), 1);
            for (Boys boys : list) {
                System.out.println(boys);
            }
        } finally {
            DbUtils.close(connection);
        }
    }

    public static void testScalar() throws Exception {
        Connection connection = null;
        try {
            connection = getConnection();
            QueryRunner qr = new QueryRunner();
            Object query = qr.query(connection, "select name from boys where id = ?", new ScalarHandler(), 1);
            System.out.println(query);
        } finally {
            DbUtils.close(connection);
        }
    }

    static class Boys {
        private Integer id;
        private String name;
        private String email;

        public Boys() {
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        @Override
        public String toString() {
            return "Boys{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", email='" + email + '\'' +
                    '}';
        }
    }
}
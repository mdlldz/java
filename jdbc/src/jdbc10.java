import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;
import javax.sql.DataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.junit.jupiter.api.Test;

public class jdbc10 {
    @Test
    public void testDataSource() {
        try {
            Properties properties = new Properties();
            InputStream inputStream = jdbc10.class.getClassLoader().getResourceAsStream("druid.properties");

            if (inputStream == null) {
                throw new RuntimeException("未找到 druid.properties 配置文件");
            }
            properties.load(inputStream);
            inputStream.close();
            DataSource ds = DruidDataSourceFactory.createDataSource(properties);
            try (Connection connection = ds.getConnection()) {
                System.out.println("连接成功: " + connection);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
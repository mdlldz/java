import org.junit.Before;
import org.junit.Test;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class daotest {
    private DAO<User> userDAO;

    @Before
    public void init() {
        userDAO = new DAO<>();
        userDAO.save("1", new User(1, 20, "张三"));
        userDAO.save("2", new User(2, 21, "李四"));
        userDAO.save("3", new User(3, 22, "王五"));
    }

    @Test
    public void testSave() {
        userDAO.save("4", new User(4, 23, "赵六"));
        System.out.println(userDAO.get("4"));
    }

    @Test
    public void testGet() {
        User user = userDAO.get("1");
        System.out.println(user);
    }

    @Test
    public void testUpdate() {
        userDAO.update("2", new User(2, 25, "李四更新"));
        System.out.println(userDAO.get("2"));
    }

    @Test
    public void testList() {
        List<User> userList = userDAO.list();
        System.out.println(userList);
    }

    @Test
    public void testDelete() {
        userDAO.delete("3");
        System.out.println(userDAO.list());
    }
}
class User {
    private int id;
    private int age;
    private String name;

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{id=" + id + ", age=" + age + ", name='" + name + "'}";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class DAO<T> {
    private Map<String, T> map = new HashMap<>();

    public void save(String id, T entity) {
        map.put(id, entity);
    }

    public T get(String id) {
        return map.get(id);
    }

    public void update(String id, T entity) {
        if (map.containsKey(id)) {
            map.put(id, entity);
        }
    }

    public List<T> list() {
        return new ArrayList<>(map.values());
    }

    public void delete(String id) {
        map.remove(id);
    }
}
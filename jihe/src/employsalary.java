import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class employsalary { public static void main(String[] args) {
    Map<String, Integer> m = new HashMap<>();
    m.put("jack", 650);
    m.put("tom", 1200);
    m.put("smith", 2900);

    m.put("jack", 2600);

    Set<String> keys = m.keySet();
    for (String key : keys) {
        m.put(key, m.get(key) + 100);
    }

    for (String name : keys) {
        System.out.println("员工：" + name);
    }

    for (Integer salary : m.values()) {
        System.out.println("工资：" + salary);
    }
}
}

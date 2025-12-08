import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
public class setmethod {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("john");
        set.add("lucy");
        set.add("john");
        set.add("jack");
        set.add(null);
        set.add(null);
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object object = iterator.next();
            System.out.println(object);
        }

        System.out.println();
        for (Object object : set) {
            System.out.println("obj= " + object);
        }
    }
}

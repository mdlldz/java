import java.util.ArrayList;
import java.util.List;

public class collection1 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("jack");
        list.add(10);
        list.add(true);
        System.out.println("list = " + list);
          list.remove(0);
        System.out.println("list = " + list );
        list.remove("jack");
        System.out.println("list=" + list);
        System.out.println(list.contains("jack"));
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.clear();
        System.out.println("list=" + list);
        List list1 = new ArrayList();
        list1.add(12);
        list1.add(13);
        list.addAll(list1);
        System.out.println(list);
        System.out.println(list.containsAll(list1));
        list.add(25);
        System.out.println(list);
        System.out.println("list=" + list);
    }
}

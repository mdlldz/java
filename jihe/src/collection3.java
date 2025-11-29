
import java.util.ArrayList;
import java.util.List;

public class collection3 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("张三丰");
        list.add("贾宝玉");
        list.add(1, "mdl");
        System.out.println("list=" + list);
        List list2 = new ArrayList();
        list2.add("jack");
        list2.add("tom");
        list.addAll(1, list2);
        System.out.println("list=" + list);
        System.out.println(list.indexOf("mdl"));
        list.add("mdl");
        System.out.println(list.lastIndexOf("mdl"));
        list.remove(0);
        System.out.println(list);
        list.set(1,"玛丽");
        System.out.println(list);
        List returnlist = list.subList(0, 2);
        System.out.println("returnlist=" + returnlist);
    }
}

import java.util.ArrayList;
public class arraylist {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        for(int i=1;i<=10;i++){
            list.add(i);
        }
        for(int i=11;i<=15;i++){
            list.add(i);
        }
        list.add(100);
        list.add(200);
        list.add(null);
        for (Object object : list) {
            System.out.println(object);
        }
    }
}

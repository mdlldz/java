import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class date {
    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.println(d1);
        Date d2 = new Date(9234567);
        System.out.println(d1.getTime());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss E");
        String format = sdf.format(d1);

        String s = "1996年01月01日 10:20:30 星期一";
        try {
            Date parse = sdf.parse(s);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}

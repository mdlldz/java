import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class zhengze8 {
    public static void main(String[] args) {
        String num = "-0.01";
        String regStr = "^[+-]?\\d+(\\.\\d*)?$";
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(num);
        System.out.println(matcher.matches());
    }
}
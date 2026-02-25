import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class zhengze7 {
    public static void main(String[] args) {
        String email = "test_123@tsinghua.org.cn";
        String regStr = "^[a-zA-Z0-9_-]+@([a-zA-Z]+\\.)+[a-zA-Z]+$";
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(email);
        System.out.println(matcher.matches());
    }
}
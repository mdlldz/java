import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class zhengze4 {
    public static void main(String[] args) {
        String content = "a11c8abcABC";
        String regStr = "[0-9]";
        Pattern pattern = Pattern.compile(regStr, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println("找到 " + matcher.group(0));
        }
    }
}
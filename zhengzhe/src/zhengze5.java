import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class zhengze5 {
    public static void main(String[] args) {
        String content = "1111111aaahello";
        String regStr = "a{3,4}";
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println("找到 " + matcher.group(0));
        }
    }
}
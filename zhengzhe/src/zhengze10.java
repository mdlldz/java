import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class zhengze10 {
    public static void main(String[] args) {
        String content = "hellomdl教育 jackmdl老师 mdl同学hello";
        String regStr = "韩顺平(?:教育|老师|同学)";
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println("找到: " + matcher.group(0));
        }
    }
}
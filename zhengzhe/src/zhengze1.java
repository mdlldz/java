import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class zhengze1 {
    public static void main(String[] args) {
        String content = "<a target=\"_blank\" title=\"测试标题1\">链接1</a>" +
                "<a target=\"_blank\" title=\"测试标题2\">链接2</a>";

        Pattern pattern = Pattern.compile("<a target=\"_blank\" title=\"(\\S*)\"");

        int no = 0;
        Matcher matcher = pattern.matcher(content);

        while (matcher.find()) {
            System.out.println("找到: " + (++no) + " " + matcher.group(1));
        }
    }
}
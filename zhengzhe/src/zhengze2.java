import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class zhengze2 {
    public static void main(String[] args) {
        String content = "测试文本1234，包含5678和9012数字串";
        String regStr = "\\d\\d\\d\\d";

        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);

        while (matcher.find()) {
            System.out.println("找到：" + matcher.group(0));
        }
    }
}
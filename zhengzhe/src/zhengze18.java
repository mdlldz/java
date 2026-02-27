import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class zhengze18 {
    public static void main(String[] args) {
        String url = "https:/www.sohu.com:8080/abc/index.htm";
        String reg = "^(\\w+):/([^:]+):(\\d+).+/([^/]+)$";
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(url);
        if (matcher.matches()) {
            System.out.println("协议: " + matcher.group(1));
            System.out.println("域名: " + matcher.group(2));
            System.out.println("端口: " + matcher.group(3));
            System.out.println("文件名: " + matcher.group(4));
        }
    }
}
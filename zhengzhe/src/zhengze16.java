import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class  zhengze16 {
    public static void main(String[] args) {
        String reg1 = "(\\d)\\1";
        String reg2 = "(\\d)\\1{4}";
        String reg3 = "(\\d)(\\d)\\2\\1";
        String reg4 = "\\d{5}-(\\d)\\1{2}(\\d)\\2{2}(\\d)\\3{2}";

        String content = "5225 1551 11 22222 12321-333999111";
        testReg(reg1, content);
        testReg(reg2, content);
        testReg(reg3, content);
        testReg(reg4, content);
    }

    public static void testReg(String regStr, String content) {
        System.out.println("=== 测试正则: " + regStr + " ===");
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println("找到: " + matcher.group(0));
        }
    }
}
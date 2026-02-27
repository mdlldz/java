import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class zhengze17 {
    public static void main(String[] args) {
        String content = "我....我要....学学学学学....编程java!";
        String reg1 = "\\.+";
        String reg2 = "(.)\\1+";

        Pattern pattern = Pattern.compile(reg1);
        Matcher matcher = pattern.matcher(content);
        content = matcher.replaceAll("");

        pattern = Pattern.compile(reg2);
        matcher = pattern.matcher(content);
        content = matcher.replaceAll("$1");

        System.out.println(content);
    }
}
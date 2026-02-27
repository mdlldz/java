import java.util.regex.Pattern;

public class zhengze14 {
    public static void main(String[] args) {
        String content = "I am hsp from hspedu.com.";
        String pattern = ".*hspedu.*";
        boolean isMatch = Pattern.matches(pattern, content);
        System.out.println("是否整体匹配成功 " + isMatch);
    }
}
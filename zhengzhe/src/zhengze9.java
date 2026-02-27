import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class zhengze9 {
    public static void main(String[] args) {
        String content = "hanshunping sphan nnhan";
        String regStr = "han\\b";
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println("找到=" + matcher.group(0));
        }
    }
}
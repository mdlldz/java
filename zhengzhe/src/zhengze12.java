import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class zhengze12 {
    public static void main(String[] args) {
        String regHanZi = "^[一-龥]+$";
        String regPostCode = "^[1-9]\\d{5}$";
        String regQQ = "^[1-9]\\d{4,9}$";
        String regPhone = "^(13|14|15|18)\\d{9}$";
        String regURL = "^(https?://)([\\w-]+\\.)+[\\w-]+(/[\\w-./?%&=]*)?$";

        String testHanZi = "mdl";
        String testPostCode = "100086";
        String testQQ = "123456789";
        String testPhone = "13812345678";
        String testURL = "https://www.bilibili.com/video/BV1fh411y7R8?from=search&seid=1831060912083761326";

        Pattern pattern = Pattern.compile(regHanZi);
        Matcher matcher = pattern.matcher(testHanZi);
        System.out.println("汉字验证: " + matcher.matches());

        pattern = Pattern.compile(regPostCode);
        matcher = pattern.matcher(testPostCode);
        System.out.println("邮政编码验证: " + matcher.matches());

        pattern = Pattern.compile(regQQ);
        matcher = pattern.matcher(testQQ);
        System.out.println("QQ号码验证: " + matcher.matches());

        pattern = Pattern.compile(regPhone);
        matcher = pattern.matcher(testPhone);
        System.out.println("手机号码验证: " + matcher.matches());

        pattern = Pattern.compile(regURL);
        matcher = pattern.matcher(testURL);
        System.out.println("URL验证: " + matcher.matches());
    }
}
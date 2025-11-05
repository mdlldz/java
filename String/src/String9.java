public class String9 {
    public static void main(String[] args) {
        String s = "mdlldz";
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        s = s.replace('l','a');
        String poem = "锄禾日当午,汗滴禾下土,谁知盘中餐,粒粒皆辛苦";
        String[] split = poem.split(",");
        poem = "E:\\aaa\\bbb";
        split = poem.split("\\\\");
        System.out.println("==分割后内容===");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
        s = "happy";
        char[] chs = s.toCharArray();
        for (int i = 0; i < chs.length; i++) {
            System.out.println(chs[i]);
        }
        String a = "jchn";
        String b = "jack";
        System.out.println(a.compareTo(b));
    }
}

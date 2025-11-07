public class StringBuffer2 {
    public static void main(String[] args) {
        String str = "mdl";
        StringBuffer stringBuffer = new StringBuffer(str);
        StringBuffer stringBuffer1 = new StringBuffer();
        stringBuffer1 = stringBuffer1.append(str);
        StringBuffer stringBuffer2 = new StringBuffer("mdl");
        String s = stringBuffer2.toString();
        String s1 = new String(stringBuffer2);
    }
}

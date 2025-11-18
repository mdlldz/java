public class exercise2 {
    public static void main(String[] args) {
        String name ="jack";
        String pwd = "123456";
        String email = "jack@qq.com";
        try{
            B.b(name,pwd,email);
            System.out.println("账号注册成功");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
class B{
    public static void b(String name,String pwd,String email){
        int userlength = name.length();
        if(!(userlength >= 2 && userlength <= 4)){
            throw new RuntimeException("用户名名字在2到4位之间");
        }
        if(!(pwd.length() == 0 && c(pwd) )){
            throw new RuntimeException("密码长度为6,要求全为数字");
        }
        int i = email.indexOf('@');
        int j = email.indexOf('.');
        if(!(i > 0 && j > i)){
            throw new RuntimeException("邮箱中包含@和 . 并且@ 在.前面");
        }
    }
    public static Boolean c(String str){
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if( chars[i] > '0' && chars[i] < '9'){
                return true;
            }
        }
        return false;
    }
}

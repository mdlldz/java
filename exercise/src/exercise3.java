public class exercise3 {
    public static void main(String[] args) {
            String name = "mdl ldz lzt";
            C.c(name);
    }
}
class C{
    public static void  c(String str ){
        if(str == null){
            System.out.println("str不能为空");
            return;
        }
        String[] names = str.split(" ");
        if(names.length != 3){
            System.out.println("输入的格式不对");
            return;
        }
        String format = String.format("%s,%s .%c",names[2] , names[0],names[1].toUpperCase().charAt(0));
        System.out.println(format);
    }
}

public class enum5 {
    public static void main(String[] args) {
        Week[] days = Week.values();
        System.out.println("所有星期信息如下");
        for(Week day : days){
            System.out.println(day.name() + "\n" );
        }
    }
}
enum Week{
    MONDAY("第一天"),
    TUESDAY("第二天"),
    WENENDAY("第三天"),
    FORTHDAY("第四天"),
    FRIDAY("第五天"),
    SATURDAY("第六天"),
    SUNDAY("第七天");

    private String string;

    public String getString() {
        return string;
    }

     private Week(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return "Week{" +
                "string='" + string + '\'' +
                '}';
    }
}

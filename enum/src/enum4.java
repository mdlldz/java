public class enum4 {
    public static void main(String[] args) {
        Season0 autumun = Season0.AUTUMN;
        System.out.println(autumun.name());
        System.out.println(autumun.ordinal());
        Season0 [] values = Season0.values();
        for(Season0 season0 : values){
            System.out.println(season0);
        }
        Season0 spring = Season0.valueOf("SPRING");
        System.out.println(spring);
        System.out.println(Season0.AUTUMN.compareTo(Season0.SPRING));
    }
}


public class enum2 {
    public static void main(String[] args) {
        System.out.println(Season0.AUTUMN);
        System.out.println(Season0.SPRING);
        System.out.println(Season0.SUMMER);
        System.out.println(Season0.WINTER);
    }
}
enum Season0{
    SPRING("春天","温暖"),SUMMER("夏天","炎热"),AUTUMN("秋天","凉爽"),WINTER("冬天","寒冷");
    private String name;//季节名称
    private String description;//季节描述
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    private Season0(String name,String description){
        this.name=name;
        this.description=description;
    }

    @Override
    public String toString() {
        return "Season0{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

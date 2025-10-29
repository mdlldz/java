import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil;

public class enum1 {
    public static void main(String[] args) {
        System.out.println(Season.AUTUMN);
        System.out.println(Season.SPRING);
        System.out.println(Season.SUMMER);
        System.out.println(Season.WINTER);
    }
}
class Season{
    private String name;//季节名称
    private String description;//季节描述
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    private Season(String name,String description){
        this.name=name;
        this.description=description;
    }
    public final static Season SPRING = new Season("春天","温暖");
    public final static Season SUMMER = new Season("夏天","炎热");
    public final static Season AUTUMN = new Season("秋天","凉爽");
    public final static Season WINTER = new Season("冬天","寒冷");

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

public class exercise9 {
    public static void main(String[] args) {
        Color color = Color.GREEN;
        color.show();
        switch (color){
            case BLACK:
                System.out.println("匹配到黑色");
                break;
            case YELLOW:
                System.out.println("匹配到黄色");
                break;
            case BLUE:
                System.out.println("匹配到蓝色");
                break;
            default:
                System.out.println("匹配不到");
                break;
        }
    }
}
enum Color implements IA{
    RED(255,0,0),GREEN(0,255,0),BLUE(0,0,255),BLACK(0,0,0),YELLOW(255,255,0);
    private int redValue;
    private int greenValue;
    private int blueValue;

    Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }
    public void show(){
        System.out.println("属性值为" + redValue + "," + greenValue + "," + blueValue);
    }
}
interface IA{
   public void show();
}

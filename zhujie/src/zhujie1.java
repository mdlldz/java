public class zhujie1 {
}
@Deprecated
class Father{
    @Deprecated
    public String name;
    public void fly(){
        System.out.println("Father fly...");
    }
    //@Deprecated的说明 几点.
    @Deprecated
    public void sing(){
        System.out.println("Father sing...");
    }
}
class Son extends Father{
    //Override 使用说明
    @Override
    public void fly() {
        System.out.println("Son fly....");
    }
}
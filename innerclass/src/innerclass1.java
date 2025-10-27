public class innerclass1 {
}
class outer{
    private int n1 = 100;
    public outer(int n1){
        this.n1 = n1;
    }
    public void m1(){
        System.out.println("m1()");
    }
    {
        System.out.println("代码块");
    }
    class Inter{

    }
}

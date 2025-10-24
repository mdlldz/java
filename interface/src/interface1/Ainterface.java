package interface1;

public interface Ainterface {
    public int n1 = 10;
    public void hi();
    default public void ok(){
        System.out.println("ok");

    }
}

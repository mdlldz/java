package abstract2;

abstract public class Template {
    public abstract void jod();
    public void calculateTime(){
        long start = System.currentTimeMillis();
        jod();
        long end =System.currentTimeMillis();
        System.out.println("执行时间" + (end - start));
    }
}

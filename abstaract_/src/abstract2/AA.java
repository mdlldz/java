package abstract2;

public class AA extends Template{
    public void jod(){
        long num = 0;
        for (long i = 0; i < 800000 ; i++) {
            num += i;
        }
    }
}

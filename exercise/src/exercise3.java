public class exercise3 {
    public static void main(String[] args) {
        System.out.println(Frock.getNextNum());
        System.out.println(Frock.getNextNum());
        Frock frock1 = new Frock();
        System.out.println(frock1.getSerialNumber());
        Frock frock2 = new Frock();
        System.out.println(frock2.getSerialNumber());
    }
}
class Frock{
    private int serialNumber;
    private static int currentNum = 100000;
    public static int getNextNum(){
        currentNum += 100;
        return currentNum;
    }
    public int getSerialNumber() {
        return serialNumber;
    }
    public Frock(){
        serialNumber = Frock.getNextNum();
    }
}


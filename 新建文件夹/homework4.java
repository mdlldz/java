public class homework4 {
        public static void main(String [] args){
            int[] zu = {12,33,44};
            A03 zu1 = new A03();
            int [] zu0  = zu1.copyzu(zu);
            for (int i = 0; i < zu0.length; i++) {
                System.out.println(zu0[i] + " ");
            }
        }
}
class A03{
    public int[] copyzu(int [] zu){
        int [] zu0 = new int[zu.length];
        for (int i = 0; i < zu.length; i++) {
            zu0[i] = zu[i];
        }
    return zu0;
    }
}

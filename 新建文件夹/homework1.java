public class homework1 {
        public static void main(String [] args){
            double [] zu = {44.5,55.7,88.8,11.8,66.6,22.5};
            A01 a = new A01();
            System.out.println(a.max(zu));
        }
}
class A01{
    public double max(double[] zu){
        double max = zu[0];
        for (int i = 0; i < zu.length; i++) {
            if(max < zu[i]){
                max = zu[i];
            }
        }
    return  max;
    }
}

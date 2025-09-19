public class maopao0{
    public static void main(String[] args) {
        int [] zu1 = {24,69,80,57,13};
        int temp = 0;
        for(int i = 0;i < zu1.length - 1;i++){
            for(int j = 0;j < zu1.length - 1 - i;j++){
                if(zu1[j]  < zu1[j+1]){
                temp = zu1[j];
                zu1[j] = zu1[j + 1];
                zu1[j + 1] = temp;
                }
            }
        }
        for(int i = 0;i < zu1.length;i++){
            System.out.print(zu1[i] + " ");
        } 
    }
}    
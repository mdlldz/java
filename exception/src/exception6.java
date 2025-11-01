public class exception6 {
    public static void main(String[] args) {
        int age = 180;
        if(!(age >= 18 && age <= 120)){
            throw new Ageextention("年龄需要在18至120之间");
        }
        System.out.println("年龄范围正确");
    }

}
class Ageextention extends RuntimeException{
    public Ageextention(String message){
        super(message);
    }
}

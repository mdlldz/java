public class trycatch2 {
    public static void main(String[] args) {
        try {
            Person person = new Person();
            person = null;
            int n1 = 1;
            int n2 = 0;
            int res = n1 / n2;
        }
        catch (NullPointerException e){
            System.out.println("空指针异常" + e.getMessage());
        }
        catch (ArithmeticException e){
            System.out.println("算数异常" + e.getMessage());
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
finally {

        }
    }
}
class Person{
    String name;

    public String getName() {
        return name;
    }
}
public class exception7 {
    public static void main(String[] args) {
        try {
            ReturnExceptionDemo.methodA();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        ReturnExceptionDemo.methodB();
    }
}
class ReturnExceptionDemo {
    static void methodA () {
        try {
            System.out.println ("进入方法 A");
            throw new RuntimeException ("制造异常");
        }
        finally {
            System.out.println ("用 A 方法的 finally");
        }
    }
    static void methodB () {
        try {System.out.println ("进入方法 B");return;
        }
        finally {
            System.out.println ("调用 B 方法的 finally");
        }
    }
}


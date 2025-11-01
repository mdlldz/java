public class throw2 {

}
    class Father {
    public void method() throws RuntimeException {}
    }
    class Son extends Father {
        public void method() throws NullPointerException {}
    }

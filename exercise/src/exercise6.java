public class exercise6 {
    public static void main(String[] args) {
        new A().fi();

    }
}
class A {
    private final String name = "jack";
    public void fi() {
        class B {
            private final String name = "mdl";
            public void show(){
                System.out.println(name + "外部类的name = " + A.this.name);
            }
        }
        B b = new B();
        b.show();
    }
}
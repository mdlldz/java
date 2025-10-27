public class interclass7 {
    public static void main(String[] args) {
        Outer01 outer01 = new Outer01();
        Outer01.Innter01 innter01 = outer01.new Innter01();
        Outer01.Innter01 innter012 = new Outer01().new Innter01();
        Outer01.Innter01 innter01Instance = new Outer01().getInnter01Instance();
    }
}

    class Outer01{
        private int n1 = 10;
        public String name = "张三";
        class Innter01{
            public void say(){
                System.out.println("Outer01 的 n1 = " + n1 + " outer01 的 name = " + name);
            }
        }
        public Innter01 getInnter01Instance(){
            return new Innter01();
        }
        private void show() {
            Innter01 innter01 = new Innter01();
            innter01.say();
        }
    }


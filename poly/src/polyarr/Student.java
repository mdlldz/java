package polyarr;

    public class Student extends Person{
        private double score ;
        public Student(String name, int age, double score) {
            super(name, age);
            this.score = score;
        }
        public String say(){
            return super.say()  + "\t" + score;
        }
        public String study(){
            return "mdl正在学习";
        }
    }

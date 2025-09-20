public class duixiang0{
    public static void main(String[] args) {
    	Cat cat1 = new Cat();
    	cat1.name = "小白";
    	cat1.age = 2;
    	cat1.gender = '公';
    	cat1.weigth = 6.6;
    	cat1.color = "白色";
    	Cat cat2 = new Cat();
    	cat2.name = "小黑";
    	cat2.age = 3;
    	cat2.gender = '公';
    	cat2.weigth = 5.5;
    	cat2.color = "黑色";
    	System.out.print("第一只猫的信息如下：" + "\n" + cat1.name + " " + cat1.age + " " + cat1.gender+ " " + cat1.weigth + " " + cat1.color + "\n");
    	System.out.print("第二只猫的信息如下：" + "\n" + cat2.name + " " + cat2.age + " " + cat2.gender+ " " + cat2.weigth + " " + cat2.color);
    }
}    
class Cat{
		String name;
		int age;
		char gender;
		String color;
		double weigth; 
}
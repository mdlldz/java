public class duixiang0{
    public static void main(String[] args) {
    	Cat cat1 = new Cat();
    	cat1.name = "С��";
    	cat1.age = 2;
    	cat1.gender = '��';
    	cat1.weigth = 6.6;
    	cat1.color = "��ɫ";
    	Cat cat2 = new Cat();
    	cat2.name = "С��";
    	cat2.age = 3;
    	cat2.gender = '��';
    	cat2.weigth = 5.5;
    	cat2.color = "��ɫ";
    	System.out.print("��һֻè����Ϣ���£�" + "\n" + cat1.name + " " + cat1.age + " " + cat1.gender+ " " + cat1.weigth + " " + cat1.color + "\n");
    	System.out.print("�ڶ�ֻè����Ϣ���£�" + "\n" + cat2.name + " " + cat2.age + " " + cat2.gender+ " " + cat2.weigth + " " + cat2.color);
    }
}    
class Cat{
		String name;
		int age;
		char gender;
		String color;
		double weigth; 
}
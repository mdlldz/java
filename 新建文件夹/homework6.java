public class homework6 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("旺财", "棕色", 3);
        Dog dog2 = new Dog("小白", "白色", 2);
        dog1.show();
        dog2.show();
    }
}

class Dog {
    private String name;
    private String color;
    private int age;

    public Dog(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void show() {
        System.out.println("名字：" + this.name + "，颜色：" + this.color + "，年龄：" + this.age + "岁");
    }
}

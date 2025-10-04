package com.mdl.encap;

import java.util.Scanner;
public class encap1 {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("请输入名字");
        Scanner myScanner = new Scanner(System.in);
        String name = myScanner.next();
        System.out.println("请输入年龄");
        int age = myScanner.nextInt();
        System.out.println("请输入密码");
        int code = myScanner.nextInt();
        System.out.println("请输入薪水");
        double salary = myScanner.nextDouble();
        person.setName(name);
        person.setAge(age);
        person.setCode(code);
        person.setSalary(salary);
        System.out.println(person.info());
    }
    static class Person {
        public String name;
        public int age;
        private double salary;
        private int code; // 新增密码成员变量

        public String getName() {
            return name;
        }
        public void setName(String name) {
            if (name.length() > 1 && name.length() < 6) {
                this.name = name;
            } else {
                System.out.println("输入的名字不合理");
            }
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            if (age > 1 && age < 120) {
                this.age = age;
            } else {
                System.out.println("输入的年龄不合理");
            }
        }

        public double getSalary() {
            return salary;
        }
        public void setCode(int code) {
            this.code = code;
        }

        public void setSalary(double salary) {
            if (this.code == 283729) {
                this.salary = salary;
            } else {
                System.out.println("密码错误，无法设置薪水");
            }
        }

        public String info() {
            return "名字=" + name + "，年龄=" + age + "，薪水=" + salary;
        }
    }
}
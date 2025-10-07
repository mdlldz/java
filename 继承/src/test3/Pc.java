package test3;

import java.sql.SQLOutput;

public class Pc extends Computer {
    private String brand;
    public Pc(String cpu, int memory, int dist, String brand) {
        super(cpu, memory, dist);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void show2() {
        System.out.println(show1() + "brand=" + brand);
    }
}

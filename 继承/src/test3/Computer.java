package test3;

public class Computer {
    private String cpu;
    private int memory;
    private int dist;
    public Computer(String cpu, int memory, int dist) {
        this.cpu = cpu;
        this.memory = memory;
        this.dist = dist;
    }
    public String show1(){
        return "cpu=" + cpu + "memory=" + memory + "dist=" + dist;
    }
    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getDist() {
        return dist;
    }

    public void setDist(int dist) {
        this.dist = dist;
    }
}


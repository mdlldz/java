class DeadLockDemo extends Thread {
    static Object o1 = new Object();
    static Object o2 = new Object();
    boolean flag;

    public DeadLockDemo(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if (flag) {
            synchronized (o1) {
                System.out.println(Thread.currentThread().getName() + " 进入1");
                synchronized (o2) {
                    System.out.println(Thread.currentThread().getName() + " 进入2");
                }
            }
        } else {
            synchronized (o2) {
                System.out.println(Thread.currentThread().getName() + " 进入3");
                synchronized (o1) {
                    System.out.println(Thread.currentThread().getName() + " 进入4");
                }
            }
        }
    }

    public static void main(String[] args) {
        DeadLockDemo deadLockDemo1 = new DeadLockDemo(true);
        DeadLockDemo deadLockDemo2 = new DeadLockDemo(false);
        deadLockDemo1.start();
        deadLockDemo2.start();
    }
}
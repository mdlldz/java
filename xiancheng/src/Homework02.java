public class Homework02 {
    public static void main(String[] args) {
        BankCard card = new BankCard(10000);
        new WithdrawThread("用户A", card, 1000).start();
        new WithdrawThread("用户B", card, 1000).start();
    }
}
class BankCard {
    private int balance;

    public BankCard(int balance) {
        this.balance = balance;
    }

    public synchronized boolean withdraw(int amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println(Thread.currentThread().getName() + "取款成功，取款金额：" + amount + "，当前余额：" + this.balance);
            return true;
        } else {
            System.out.println(Thread.currentThread().getName() + "取款失败，余额不足，当前余额：" + this.balance);
            return false;
        }
    }
}

class WithdrawThread extends Thread {
    private BankCard card;
    private int perAmount;

    public WithdrawThread(String name, BankCard card, int perAmount) {
        super(name);
        this.card = card;
        this.perAmount = perAmount;
    }

    @Override
    public void run() {
        while (card.withdraw(perAmount)) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

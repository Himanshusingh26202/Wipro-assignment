package Day_9_Assignment;
import java.util.*;

class BankAccount {
    private int balance;

    public BankAccount(int initialBalance) {
        this.balance = initialBalance;
    }
    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() +
                " Deposited: " + amount + " ; Balance: " + balance);
        notifyAll();
    }

    public synchronized void withdraw(int amount) {
        while (balance < amount) {
            try {
                System.out.println(Thread.currentThread().getName() +
                        " Waiting... Insufficient balance!");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        balance -= amount;
        System.out.println(Thread.currentThread().getName() +
                " Withdrew: " + amount + " ; Balance: " + balance);
    }
}

public class Bank_sys_thread {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter initial balance: ");
	        int initialBalance = sc.nextInt();

	        BankAccount account = new BankAccount(initialBalance);

	        System.out.print("Enter deposit amount: ");
	        int depositAmount = sc.nextInt();

	        System.out.print("Enter withdraw amount: ");
	        int withdrawAmount = sc.nextInt();

	        Thread depositThread = new Thread(() -> {
	            account.deposit(depositAmount);
	        }, "Deposit-Thread");

	        Thread withdrawThread = new Thread(() -> {
	            account.withdraw(withdrawAmount);
	        }, "Withdraw-Thread");

	        withdrawThread.start(); // start withdraw first to show waiting
	        depositThread.start();

	        sc.close();
	}

}

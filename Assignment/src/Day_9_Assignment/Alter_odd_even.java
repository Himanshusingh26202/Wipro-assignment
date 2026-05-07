package Day_9_Assignment;

class NumPrint{
	private int number =1;
	private final int MAX = 100;
	
	public synchronized void printOdd() {
		while(number <= MAX) {
			if(number % 2 == 0) {
				try {
					wait();
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
			}else {
				System.out.println("Odd: "+ number);
				number++;
				notify();
			}
		}
	}
	public synchronized void printEven() {
		while(number <= MAX) {
			if(number % 2 != 0) {
				try {
					wait();
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
			}else {
				System.out.println("Even: "+ number);
				number++;
				notify();
			}
		}
	}
}
public class Alter_odd_even {

	public static void main(String[] args) {
		NumPrint printer = new NumPrint();

        Thread t1 = new Thread(() -> printer.printOdd());
        Thread t2 = new Thread(() -> printer.printEven());

        t1.start();
        t2.start();

	}

}

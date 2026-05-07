package Day_9_Assignment;
class ABCPrinter {
    private int turn = 0; 
    private int repeat;

    public ABCPrinter(int repeat) {
        this.repeat = repeat;
    }
    public synchronized void printA() {
        for (int i = 0; i < repeat; i++) {
            while (turn != 0) {
                try { wait(); } catch (Exception e) {}
            }
            System.out.print("A ");
            turn = 1;
            notifyAll();
        }
    }

    public synchronized void printB() {
        for (int i = 0; i < repeat; i++) {
            while (turn != 1) {
                try { wait(); } catch (Exception e) {}
            }
            System.out.print("B ");
            turn = 2;
            notifyAll();
        }
    }

    public synchronized void printC() {
        for (int i = 0; i < repeat; i++) {
            while (turn != 2) {
                try { wait(); } catch (Exception e) {}
            }
            System.out.print("C ");
            turn = 0;
            notifyAll();
        }
    }
}
public class ABC_Sequence_Thread {

	public static void main(String[] args) {
		
		ABCPrinter printer = new ABCPrinter(5); // repeat 5 times

        Thread t1 = new Thread(() -> printer.printA());
        Thread t2 = new Thread(() -> printer.printB());
        Thread t3 = new Thread(() -> printer.printC());

        t1.start();
        t2.start();
        t3.start();
	}

}

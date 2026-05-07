package Day_9_Assignment;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Order implements Runnable {
    private int orderId;

    public Order(int orderId) {
        this.orderId = orderId;
    }

    @Override
    public void run() {
        System.out.println("Order " + orderId + " is being prepared by " +
                Thread.currentThread().getName());

        try {
            Thread.sleep(2000); // simulate delivery time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Order " + orderId + " delivered by " +
                Thread.currentThread().getName());
    }
}
public class Food_delivery_threads {

	public static void main(String[] args) {
		 int numberOfAgents = 3; // limited delivery agents
	        ExecutorService service = Executors.newFixedThreadPool(numberOfAgents);

	        // multiple orders
	        for (int i = 1; i <= 10; i++) {
	            service.execute(new Order(i));
	        }

	        service.shutdown();

	}

}

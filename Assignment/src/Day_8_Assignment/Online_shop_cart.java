package Day_8_Assignment;
import java.util.*;
;


public class Online_shop_cart {

	public static void main(String[] args) {
		HashMap<String, Double> productPrice = new HashMap<>();
        productPrice.put("Refrigerator", 30000.0);
        productPrice.put("Television", 40000.0);
        productPrice.put("Washing Machine", 25000.0);
        
        List<String> cart = new ArrayList<>();

        
        cart.add("Refrigerator");
        cart.add("Television");
        cart.add("Washing Machine");
        
        double total = 0;

        System.out.println(" Cart Items ");
        for (String item : cart) {
            double price = productPrice.get(item);
            System.out.println(item + " : " + price);
            total += price;
        }

        System.out.println("");
        System.out.println("Total Price: " + total);
		
	}

}

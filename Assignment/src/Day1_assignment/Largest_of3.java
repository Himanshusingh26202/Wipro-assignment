package Day1_assignment;
import java.util.*;
public class Largest_of3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc= new Scanner(System.in);
	     System.out.println("Enter the number a,b and c: ");
	     int a = sc.nextInt();
	     
	     int b = sc.nextInt();
	     int c = sc.nextInt();
         
         if(a>=b && a>=c) {
        	 System.out.println("Largest: " + a);
        	 
         }
         else if (b>=a && b>=c) {
        	 System.out.println("Largest: " + b);
         }
         else {
        	 System.out.println("Largest: " + c);
         }
	}

}

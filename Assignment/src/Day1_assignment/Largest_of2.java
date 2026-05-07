package Day1_assignment;
import java.util.*;
public class Largest_of2 {
 public static void main(String[] args) {
	 Scanner sc= new Scanner(System.in);
     System.out.println("Enter the number a and b: ");
     int a = sc.nextInt();
     
     int b = sc.nextInt();
	 if (a<b) {
		 System.out.println(" b is largest");
	 }
	 else if(a>b) {
		 System.out.println(" a is largest");
	 }
	 else
	 { 
		 System.out.println("both are equal");
	 
	 }
 }
}

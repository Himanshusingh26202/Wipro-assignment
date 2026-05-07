package Day1_assignment;
import java.util.*;
public class Posi_0_neg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the number: ");
   int num = sc.nextInt();
   if (num > 0) {
       System.out.println(num + " is Positive.");
   } else if (num < 0) {
       System.out.println(num + " is Negative.");
   } else {
       System.out.println("The number is Zero.");
   }
	}

}

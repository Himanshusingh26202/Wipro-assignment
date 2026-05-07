package Day2Assignment;
import java.util.*;
public class Even_odd_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter number: ");
		 int num = sc.nextInt();
		 switch (num % 2) {
		 case 0:
		 System.out.println("Even");
		 break;
		 case 1:
		 case -1:
		 System.out.println("Odd");
		 break;
		 }
	}

}

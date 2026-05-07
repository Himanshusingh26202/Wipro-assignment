package Day1_assignment;
import java.util.*;
public class Positive_or_negitive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter the number: ");
       int n = sc.nextInt();
       if(n>0) {
    	   System.out.println("number is positive");
       }
       else if(n<0) {
    	   System.out.println("number is negitive");
       }
       else {
    	   System.out.println("number is 0");
       }
	}

}

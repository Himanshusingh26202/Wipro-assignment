package Day1_assignment;

import java.util.Scanner;

public class Odd_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc= new Scanner(System.in);
	       System.out.println("Enter the number: ");
	       int n = sc.nextInt();
	       if(n%2==0) {
	    	   System.out.println("its a even number");
	       }
	       else  {
	    	   System.out.println("odd number");
	       }
	}

}

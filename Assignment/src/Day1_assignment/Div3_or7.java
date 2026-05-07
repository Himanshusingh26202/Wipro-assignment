package Day1_assignment;

import java.util.Scanner;

public class Div3_or7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number: ");
		int num=sc.nextInt();
		 
	      if(num % 3 == 0 || num %7 == 0) {
	    	  System.out.println(num + " divisible");
	      }
	      else {
	    	  System.out.println(" not divisible ");
	      }
	}

}

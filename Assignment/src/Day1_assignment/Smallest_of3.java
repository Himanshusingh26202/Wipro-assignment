package Day1_assignment;

import java.util.Scanner;

public class Smallest_of3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		   System.out.println("Enter the number a, b & c: ");
		  
		   int a = sc.nextInt();
		   int b = sc.nextInt();
		   int c = sc.nextInt();
		   

	        if (a <= b && a <= c) {
	            System.out.println(a + " is the smallest.");
	        } else if (b <= a && b <= c) {
	            System.out.println(b + " is the smallest.");
	        } else {
	            System.out.println(c + " is the smallest.");
	        }
	        
	}

}
